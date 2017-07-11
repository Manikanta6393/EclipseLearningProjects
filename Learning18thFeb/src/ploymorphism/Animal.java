package ploymorphism;

public class Animal {
	
	void makeSound(){
		System.out.println("Animal");
	}
	public static void main(String[] args){
		Animal cat = new Cat();
		cat.makeSound();
		Animal dog = new Dog();
		dog.makeSound();
		Animal animal = new Animal();
		animal.makeSound();
		
	}

}
