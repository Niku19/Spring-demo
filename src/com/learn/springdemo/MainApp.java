package com.learn.springdemo;

public class MainApp {

	public static void main(String[] args) {
		// create the object
		Seller theSeller = new VegetableSeller();
		
		// use the object
		System.out.println(theSeller.getSellerName());
	}

}
