/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Apr 4, 2023
 */
package dmacc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import dmacc.beans.Animal;
import dmacc.repository.AnimalRepository;


/**
 * @author abbyb
 *
 */
@Controller
public class WebController {
	@Autowired(required = false)
	AnimalRepository arepo;
	
	@GetMapping({"/", "viewAll"})
	public String viewAllHouses(Model model) {
		if(arepo.findAll().isEmpty()) {
			return addNewAnimal(model);
		}
		model.addAttribute("animal", arepo.findAll());
		return "viewAnimals";
	}
	
	@GetMapping("/inputAnimal")
	public String addNewAnimal(Model model) {
		Animal a = new Animal();
		model.addAttribute("newAnimal", a);
		return "addAnimals";
	}
}
