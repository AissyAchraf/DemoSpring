package com.springdemo;

public class tennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private String emailAddresse;
	private String team;
	
	public tennisCoach() {
		System.out.println("tennisCoach : inside no-arg constructor");
	}

	public String getEmailAddresse() {
		return emailAddresse;
	}

	public void setEmailAddresse(String emailAddresse) {
		System.out.println("tennisCoach : inside setter setEmailAddresse");
		this.emailAddresse = emailAddresse;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("tennisCoach : inside setter setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("tennisCoach : inside setter setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Play 5 matchs by day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
