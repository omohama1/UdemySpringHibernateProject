package com.om.springdemo;

public class ChessCoach implements Coach {

	FortuneService fortuneService;
	
	public ChessCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play three matches against a friend";
	}

	@Override
	public String getDailyFortune() {
		return "Bobby Fischer says: "+fortuneService.getFortune();
	}

}
