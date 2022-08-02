package com.menuPractice.models;

import java.util.ArrayList;

public class Order {
	public int orderNumber;
	private double totalPrice;
	private ArrayList<Product> items;
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public ArrayList<Product> getItems() {
		return items;
	}
	public void setItems(ArrayList<Product> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [Order Number=" + orderNumber + ", Total Price=" + totalPrice + ", Purchased Items=" + items + "]";
	}
	
}
