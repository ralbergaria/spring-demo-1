package com.lov2code.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFurtune() {
		return "Today is your lucky day!";
	}

}
