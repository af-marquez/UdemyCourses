package io.github.afmarquez.pa1;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getYourDailyWorkout() {
		return "SWim more 1000m";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
