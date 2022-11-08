package Day48_collections;

public class Mobile 
{
	String brand;
	int ram;
	double price;
	public Mobile(String brand, int ram, double price) 
	{
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}
	public String toString() {
		return "Mobile [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}
	
}

 class Laptop
{
	String os;
	int noofprocessors;
	int memory;
	public Laptop(String os, int noofprocessors, int memory) 
	{
		this.os = os;
		this.noofprocessors = noofprocessors;
		this.memory = memory;
	}
	public String toString() {
		return "Laptop [os=" + os + ", noofprocessors=" + noofprocessors + ", memory=" + memory + "]";
	}
}

 class SmartWatch
{
	String brand;
	int nooffeatures;
	boolean sim;
	public SmartWatch(String brand, int nooffeatures, boolean sim) 
	{
		this.brand = brand;
		this.nooffeatures = nooffeatures;
		this.sim = sim;
	}
	public String toString() {
		return "SmartWatch [brand=" + brand + ", nooffeatures=" + nooffeatures + ", sim=" + sim + "]";
	}
}