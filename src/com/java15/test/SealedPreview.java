package com.java15.test;
/**
 * 
 * Sealed Classes:
 * It provides a way to restrict the implementation or inheritance of a class or interface
 * A new keyword permits is introduced for this purpose
 * Also, a subclass extended from a sealed class has to explicitly indicate if it is a sealed, non-sealed or final class.
 * This feature works similarly for interfaces and for records.
 */
public class SealedPreview {

	public static void main(String[] args) {
		//Animal animal=new Animal("Sheep");
		//Animal animal=new Cat("Cat");
		//Animal animal=new Burmese();
		//Animal animal=new Dog("Dog");
		//Animal animal=new Shepherd("Shepherd");
		Animal animal=new AustralianShepherd();
		System.out.println(animal.getName());
	}

}
sealed class Animal permits Dog,Cat{
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}

sealed class Cat extends Animal permits Burmese{

	public Cat(String name) {
		super(name);
	}	
	
}
final class Burmese extends Cat{

	public Burmese() {
		super("Burmese");
	}
	
}

non-sealed class Dog extends Animal{

	public Dog(String name) {
		super(name);		
	}	
}
class Shepherd extends Dog{

	public Shepherd(String name) {
		super(name);
	}	
	
}
class AustralianShepherd extends Shepherd{

	public AustralianShepherd() {
		super("AustralianShepherd");
	}	
}