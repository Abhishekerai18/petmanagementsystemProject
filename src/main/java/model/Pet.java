package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pet")
public class Pet {
	
	
	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int id;
	
	private String name="name";
	private String breed="breed";
	private String age="age";
	private String description="description";
	
	public Pet() {
		super();
	}
	

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", breed=" + breed + ", age=" + age + ", description=" + description
				+ "]";
	}



	public Pet(int id, String name, String breed, String age, String description) {
		super();
		this.id = id;
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.description = description;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
