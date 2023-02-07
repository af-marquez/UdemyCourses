package io.github.afmarquez.pa1;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		Random random = new Random();
		String[] array = {"SORTE1","SORTE2","SORTE3","SORTE4","SORTE5"};
		return array[random.nextInt(5)];
	}

}
