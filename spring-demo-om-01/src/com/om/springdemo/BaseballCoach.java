package com.om.springdemo;

public class BaseballCoach implements Coach{

	private FortuneService fortuneService;
	
	// define a constructor for dependency injection
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
