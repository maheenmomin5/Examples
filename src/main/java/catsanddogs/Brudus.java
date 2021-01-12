package catsanddogs;

public class Brudus implements HasName {
	
	Cat cat;
	Animal animal;
	
	public Brudus() {
		cat = new Cat();
		animal = new Animal();
		
	}
	
	@Override
	public String myName() {
		return "Brudus the fuzzy";
	}
	
	public Cat getCat() {
		return cat;
	}
	
	public Animal getAnimal() {
		return animal;
	}
}
