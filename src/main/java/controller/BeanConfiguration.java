/**
 * @author xbitt = twilkens
 * CIS171 - Spring 2023
 * Apr 4, 2023
 */
package controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.Address;
import beans.Adopter;
import beans.Animals;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Adopter adopter() {
		Adopter bean = new Adopter("Tate Wilkens");
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address("2640 1st Ave S APT 110", "Altoona", "IA");
		return bean;
	}
	
	@Bean
	public Animals animals() {
		Animals bean = new Animals("Caribou");
		return bean;
	}

}
