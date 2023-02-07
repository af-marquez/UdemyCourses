package io.github.afmarquez.pa1;

import org.springframework.stereotype.Component;

@Component
public class FutsalCoach implements Coach {

	@Override
	public String getYourDailyWorkout() {
		
		return "Do your tactics review today";
	}

}
