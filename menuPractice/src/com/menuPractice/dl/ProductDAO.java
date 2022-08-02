package com.menuPractice.dl;

import java.util.ArrayList;

import com.menuPractice.models.Product;

public class ProductDAO implements DAO<Product>{

	@Override
	public void addInstance(Product newInstance) {
		// TODO Auto-generated method stub
		TempStorage.products.add(newInstance);
	}

	@Override
	public ArrayList<Product> getAllInstances() {
		// TODO Auto-generated method stub
		return TempStorage.products;
	}

}
