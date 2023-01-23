package com.springdemo;

import java.util.concurrent.ThreadLocalRandom;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		int i = ThreadLocalRandom.current().nextInt(0, 3);
		return "Your fortune is : "+FortuneService.Fortunes[i];
	}

}
