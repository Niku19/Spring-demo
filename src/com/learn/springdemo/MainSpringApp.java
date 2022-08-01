package com.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("xmlApplicationContext.xml");
		
		//retrieve bean from spring container using id and interface name
		Seller seller = context.getBean("myVegetableSeller",Seller.class);
		
		//call methods on the bean
		System.out.println("Vegetable Seller name is " + seller.getSellerName());
		
		//retrieve bean from spring container using id and interface name
		Seller grocerySeller = context.getBean("myGrocerySeller",Seller.class);
				
		//call methods on the bean
		System.out.println("Grocery Seller name is " + grocerySeller.getSellerName());
		
		System.out.println("Your fortune is : " + grocerySeller.getDailyFortune());
		
		ApparelSeller apparelSeller = context.getBean("myApparelSeller",ApparelSeller.class);
		
		//call methods on the bean
		System.out.println("Apparel Seller name is " + apparelSeller.getSellerName());
				
		System.out.println("Your fortune is : " + apparelSeller.getDailyFortune());
		
		System.out.println("Apparel Seller's email is : " + apparelSeller.getEmailAddress());
		
		System.out.println("Apparel Seller's location is " + apparelSeller.getLocation());
		
		System.out.println("Apparel Seller's sub-locality is : " + apparelSeller.getSub_locality());
		
		System.out.println("Apparel Seller's team is : " + apparelSeller.getTeam());
		
		//close the context
		context.close();
	}

}
