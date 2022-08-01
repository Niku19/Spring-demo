package com.learn.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class ApparelSeller implements Seller, DisposableBean {

	private FortuneService fortuneService;
	private String emailAddress;
	private String location;
	private String sub_locality;
	private String team;
	
	public ApparelSeller()
	{
		System.out.println("Inside ApparelSeller constructor");
	}
		
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside ApparelSeller setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getSellerName() {
		return "Flipkart";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getLocation() {
		return location;
	}

	public String getSub_locality() {
		return sub_locality;
	}

	public void setSub_locality(String sub_locality) {
		this.sub_locality = sub_locality;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	//init method
	public void doMyStartupStuff()
	{
		System.out.println("ApparelSeller : Inside method doMyStartupStuff");
	}
	
	//destroy method
	public void doMyDestroyStuff()
	{
		System.out.println("ApparelSeller : Inside method doMyDestroyStuff");	
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method of ApparelSeller");
	}
	
}
