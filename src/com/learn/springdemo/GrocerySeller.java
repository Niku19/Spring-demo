package com.learn.springdemo;

public class GrocerySeller implements Seller{
	
	//defined a private field for dependency injection
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public GrocerySeller(FortuneService myFortuneService)
	{
		fortuneService = myFortuneService;
	}
	
	@Override
	public String getSellerName() {
		return "Swaminath Premchand";
	}

	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get daily fortune
		return fortuneService.getFortune();
	}
}
