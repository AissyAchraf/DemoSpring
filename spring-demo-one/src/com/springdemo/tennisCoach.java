package com.springdemo;

public class tennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Play 5 matchs by day";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
