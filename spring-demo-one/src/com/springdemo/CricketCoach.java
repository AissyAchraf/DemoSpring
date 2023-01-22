package com.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// add new fields for email addresse and team
	private String emailAddresse;
	private String team;


	public CricketCoach() {
		System.out.println("CricketCoach : inside no-arg constructor");
	}
	
	public String getEmailAddresse() {
		return emailAddresse;
	}

	public void setEmailAddresse(String emailAddresse) {
		System.out.println("CricketCoach : inside setter method - setEmailAdrresse");
		this.emailAddresse = emailAddresse;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach : inside setter method - setTeam");
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 min";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
