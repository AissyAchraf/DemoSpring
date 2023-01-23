package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjectionDemo {


	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		tennisCoach theCoach = context.getBean("myTennisCoach", tennisCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// call new methods get literal values
		System.out.println(theCoach.getEmailAddresse());
		System.out.println(theCoach.getTeam());
		
		
		// close the context
		context.close();
		

	}

}
