package com.menuPractice.ui;

import java.util.Scanner;

import com.menuPractice.dl.ProductDAO;
import com.menuPractice.models.Product;

public class newItem {
	public static void addToMenu(Scanner scanner, ProductDAO productStorage){
		Product product = new Product();
		System.out.println("Item name");
		product.name = scanner.nextLine();
		System.out.println("Item cost");
		try {
			product.setPrice(scanner.nextDouble());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		scanner.nextLine();
		System.out.println("Item Description");
		product.setDesc(scanner.nextLine());
		productStorage.addInstance(product);
		}
}
