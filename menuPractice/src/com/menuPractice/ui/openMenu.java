package com.menuPractice.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.menuPractice.dl.ProductDAO;
import com.menuPractice.dl.TempStorage;
import com.menuPractice.models.Product;
import com.menuPractice.util.Logger;
import com.menuPractice.util.Logger.LogLevel;

public class openMenu {
	public static String userInput = "";
	public static ArrayList<Product> order = new ArrayList<>();
	public static ProductDAO productStorage = new ProductDAO();
	public static Logger logger = new Logger();
	public static void open() {
			Product.create(productStorage);
			System.out.println("Welcome to corner coffee cafe");
			Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("[1] view menu");
			System.out.println("[2] add item to menu");
			if(order.size() >0) {
				System.out.println("[3] checkout");
			}
			System.out.println("[x] exit");
			userInput = scanner.nextLine();
			switch(userInput) {
			case "1":
				//loop through an arraylist of items for sale
				System.out.println("---------------------------");
				System.out.println("Please choose an option");
				int count = 1;
				for(Product prod : TempStorage.products) {
					System.out.print("["+count+"] ");
					System.out.printf("%-15s  %-15s %-15s%n", prod.name, prod.getPrice(), prod.getDesc());
					count++;
					//purchase 
				}
				System.out.println("---------------------------");
				userInput = scanner.nextLine();
				order.add(TempStorage.products.get(Integer.parseInt(userInput)-1));
				System.out.println("Added to order");
				System.out.println("---------------------------");
				break;
			case "2": 
				newItem.addToMenu(scanner, productStorage);
				break;
			case "3": 
				if(order.size()>0) {
					logger.logOrder(LogLevel.info,order);
					Purchase.items(scanner, order);
					System.out.println("---------------------------");
				}
				//check
				break;
			case "x":
				System.out.println("Thank you for visiting the cafe");
				break;
			default: 
				//logger
				break;
				}
		} while (!userInput.equals("x"));
		scanner.close();
	}
}
