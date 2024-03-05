package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Pet;
import service.PetService;

@RestController
public class PetController {

	@Autowired
	private PetService petService;

	@GetMapping("/get")
	public List<Pet> Pets() {
		return petService.getAllPets();
	}

	@PostMapping("/add")
	public Pet addPet(@RequestBody Pet pet) {
		Pet p = petService.addPet(pet);
		System.out.println(p);
		return p;
	}

	@PutMapping("/update")
	public Pet updatePet(@RequestBody Pet pet) {
		Pet p1 = petService.updatePet(pet);
		return p1;
	}

	@DeleteMapping("/delete/{id}")
	public String deletePet(@PathVariable Integer id) {
		return petService.deletePets(id);

	}

}
