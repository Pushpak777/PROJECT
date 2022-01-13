package collection;

public class Laptop {
String brand;
int ram;
String color;
double cost;
public Laptop(String brand, int ram, String color, double cost)
{
	this.brand=brand;
	this.ram=ram;
	this.color=color;
	this.cost=cost;
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", ram=" + ram + ", color="+ color + ", cost=" + cost +"]";
	
}
}
class Bike{
	String model;
	int engine;
	String color;
	double cost;
	public Bike(String model,int engine,String color,double cost)
	{
		this.model=model;
		this.engine=engine;
		this.color=color;
		this.cost=cost;
	}
	public String toString() {
		return "Bike [model=" + model + ", engine="+ engine +", color=" + color +", cost=" + cost +"]";
	}
}