package Polymorphism;

public class Car extends Vehichle {
	
	public void engine() {
		System.out.println("vehichle is not damaged cause for enivironment");
	}
	protected void fuelType() {
		System.out.println("the car tpe is electric");
	}
public static void main(String[] args) {
	Vehichle r = new Car();
	r.engine();
	r.fuelType();
}
}
