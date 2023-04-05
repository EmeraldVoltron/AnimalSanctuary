/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Apr 4, 2023
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import beans.Animals;
import repository.AnimalRepository;


/**
 * @author riley
 *For the employee class
 */
@Controller
public class WebController2 {
	@Autowired(required = false)
	AnimalRepository arepo;
	
	
	

}
