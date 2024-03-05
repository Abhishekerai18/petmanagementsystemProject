package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Pet;
import repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;

	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}

	public Pet addPet(Pet pet) {
		Pet p = petRepository.save(pet);
		return p;
	}

	public Pet updatePet(Pet pet) {
		return petRepository.save(pet);
	}

	public String deletePets(int id) {
		petRepository.deleteById(id);

		return "Deletion Successful";

	}
}
