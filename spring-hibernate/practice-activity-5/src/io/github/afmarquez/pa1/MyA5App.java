package io.github.afmarquez.pa1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyA5App {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean from spring container
		Coach theCoach = context.getBean("futsalCoach", Coach.class);
		
		// Call method on the bean	
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}