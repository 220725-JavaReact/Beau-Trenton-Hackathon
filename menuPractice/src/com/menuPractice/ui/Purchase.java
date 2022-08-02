package com.menuPractice.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.menuPractice.models.Product;

public class Purchase {
	public static void items(Scanner scanner, ArrayList<Product> order) {
		double totalPrice = 0;
		System.out.println("---------------------------");
		for(Product item : order) {
			totalPrice += item.getPrice();
			System.out.println(item.name);
		}
		System.out.println("---------------------------");
		System.out.println("Your total price is "+"$"+totalPrice);
		System.out.println("Order placed!......");
	}
}
