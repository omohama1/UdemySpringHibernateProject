package com.om.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//add new fields for email address + team
	
	private String emailAddress;
	private String team;

	public CricketCoach() {
		System.out.println("CricketCoach: inside no args constructor");
	}
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
