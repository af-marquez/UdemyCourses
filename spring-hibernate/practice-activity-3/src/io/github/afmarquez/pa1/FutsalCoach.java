package io.github.afmarquez.pa1;
public class FutsalCoach implements Coach {

	
	private FortuneService fortuneService;
	
	public FutsalCoach(FortuneService ThefortuneService) {
		fortuneService = ThefortuneService;
	}
	@Override
	public String getYourDailyWorkout() {
		
		return "Do your tactics review today";
	}

	@Override
	public String getYourDailyFortune() {
		return fortuneService.getFortune();
	}
}
