package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beans.Animals;

@SpringBootApplication
public class AnimalSanctuaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalSanctuaryApplication.class, args);
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Animals a = appContext.getBean("animals", Animals.class);
		
		System.out.println(a.toString());
		((AbstractApplicationContext) appContext).close();
	}

}
