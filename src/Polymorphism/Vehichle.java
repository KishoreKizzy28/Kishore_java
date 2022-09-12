package Polymorphism;

public class Vehichle {
	
	//private methods are not overriden
	//final and static keyword cant override  child class
	public void engine() {
		System.out.println("Vehiche is  damaged cause for enivironment");
	}
	
	protected void fuelType() {
		System.out.println("the fuel type is petrol");
	}

}
