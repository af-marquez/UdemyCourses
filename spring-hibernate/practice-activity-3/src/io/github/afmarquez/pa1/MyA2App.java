package io.github.afmarquez.pa1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyA2App {

	public static void main(String[] args) {
		//load the spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				//retrieve bean from spring container
				Coach theCoach = context.getBean("myCoach", Coach.class);
				Coach anotherCoach = context.getBean("myCoach", Coach.class);


				boolean result = (theCoach == anotherCoach);
				
				System.out.println("Are they the same? : " + result);
				System.out.println("Memory of theCoach : " + theCoach);
				System.out.println("Memory of anotherCoach : " + anotherCoach);
				//close the context
				context.close();
	}

}