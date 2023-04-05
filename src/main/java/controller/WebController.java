/**
 * @author Abigail Boggs - amboggs
 * CIS175 - Spring 2023
 * Apr 4, 2023
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import beans.Animals;
import repository.AnimalRepository;


/**
 * @author abbyb
 *
 */
@Controller
public class WebController {
	@Autowired(required=false)
	AnimalRepository arepo;
	
	@GetMapping({"/viewAll"})
	public String viewAllAnimals(Model model) {
		if(arepo.findAll().isEmpty()) {
			return addNewAnimal(model);
		}
		model.addAttribute("animals", arepo.findAll());
		return "viewAnimals";
	}
	
	@GetMapping("/inputAnimal")
	public String addNewAnimal(Model model) {
		Animals a = new Animals();
		model.addAttribute("newAnimal", a);
		return "addAnimals";
	}
	
	@PostMapping("/inputAnimal")
	public String addNewAnimal(@ModelAttribute Animals a, Model model) {
		arepo.save(a);
		return viewAllAnimals(model);
	}
	
	@GetMapping("/edit/{id}")
	public String showUpdateAnimal(@PathVariable("id") long id, Model model) {
		Animals a = arepo.findById(id).orElse(null);
		model.addAttribute("newAnimal", a);
		return "addAnimals";
		
	}
	
	@PostMapping("/update/{id}")
	public String reviseAnimal(Animals a, Model model) {
		arepo.save(a);
		return viewAllAnimals(model);
	}
	
	//both of these are to edit and delete the different pets but need the employee class
	
	//not sure if i need a viewAll in this controller?
	@GetMapping("/delete/{id}")
	public String deleteAnimal(@PathVariable("id") long id, Model model) {
		Animals a = arepo.findById(id).orElse(null);
		arepo.delete(a);
		return viewAllAnimals(model);
	}
	
	
	
	
}
