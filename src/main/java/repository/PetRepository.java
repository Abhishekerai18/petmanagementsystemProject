package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer> {

}
