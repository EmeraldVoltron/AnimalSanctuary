/**
 *@author Riley Ahlrichs riahl12 - rpahlrichs
 *CIS175 - Spring 2023
 *Apr 4, 2023
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import dmacc.beans.Animal;
import dmacc.repository.AnimalRepository;


/**
 * @author riley
 *For the employee class
 */
@Controller
public class WebController2 {
	@Autowired(required = false)
	AnimalRepository arepo;
	
	
	@GetMapping("/edit/{id}")
	public String showUpdateAnimal(@PathVariable("id") long id, Model model) {
		Animal a = arepo.findById(id).orElse(null);
		model.addAttribute("newOwner", a);
		return "addAnimals";
		
	}
	//both of these are to edit and delete the different pets but need the employee class
	
	//not sure if i need a viewAll in this controller?
	/*@GetMapping("/delete/{id}")
	public String deleteAnimal(@PathVariable("id") long id, Model model) {
		Animal a = arepo.findById(id).orElse(null);
		arepo.delete(a);
		return viewAllOwners(model);
	}*/

}
