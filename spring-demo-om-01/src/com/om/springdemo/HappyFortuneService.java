package com.om.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "The Prophets bless you from the Celestial Temple";
	}

}
