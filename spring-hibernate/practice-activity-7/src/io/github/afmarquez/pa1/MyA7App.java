package io.github.afmarquez.pa1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyA7App {

	public static void main(String[] args) {
		//load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		//retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// Call method on the bean	
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}