package com.menuPractice.models;

import com.menuPractice.dl.ProductDAO;

public class Product {
	public String name;
	private double price;
	private String desc;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) throws Exception{
		if (price <=0) throw new Exception ("Price cannot be smaller than 0");
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Item [Name=" + name + ", Price=" + price + "]";
	}
	
	public static void create(ProductDAO productStorage) {
		Product product = new Product();
		product.name = "Coffee";
		try {
			product.setPrice(2.25);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		product.setDesc("Black coffee no cream");
		productStorage.addInstance(product);
		
		Product p1 = new Product();
		p1.name = "Latte";
		try {
			p1.setPrice(3.00);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		p1.setDesc("expresso with steamed milk");
		productStorage.addInstance(p1);
		
		Product p2 = new Product();
		p2.name = "Expresso";
		try {
			p2.setPrice(2.5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		p2.setDesc("Compressed coffee");
		productStorage.addInstance(p2);
	}
}
