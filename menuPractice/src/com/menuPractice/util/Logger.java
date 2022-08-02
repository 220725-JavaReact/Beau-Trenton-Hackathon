package com.menuPractice.util;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import com.menuPractice.models.Product;

public class Logger {
	private PrintWriter pw;
	LogLevel logLevel;
	
	private final String file = LocalDate.now().toString() + " .log";
//	private static Logger logger = new Logger();
	
	public Logger() {
		try {
			FileWriter write = new FileWriter(file,true);
			pw = new PrintWriter(write, true);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public void logOrder(LogLevel logLevel,ArrayList<Product> order) {
		pw.println(logLevel+ "\t"+ order.toString() + "\t" + LocalDateTime.now());
	}
	public enum LogLevel {
		info, debug, verbose, warning, fatal, error
	}
}
