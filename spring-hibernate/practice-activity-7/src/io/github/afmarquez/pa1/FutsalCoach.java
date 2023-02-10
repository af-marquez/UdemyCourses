package io.github.afmarquez.pa1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FutsalCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;
	
	@Override
	public String getYourDailyWorkout() {
		
		return "Do your tactics review today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
