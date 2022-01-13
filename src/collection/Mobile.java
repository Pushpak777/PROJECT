package collection;

public class Mobile 
{
	String brand;
	int imei;
	double cost;
	public Mobile(String brand, int imei, double cost)
	{
		this.brand=brand;
		this.imei=imei;
		this.cost=cost;
	}
	public String toString()
	{
		return "Mobile [brand=" + brand + ", imei=" + imei + ", cost=" + cost + "]";
	}
}
class laptop
{
	String colour;
	int ram;
	public laptop(String colour, int ram)
	{
		this.colour=colour;
		this.ram=ram;
	}
	public String toString()
	{
		return "Laptop [colour=" + colour + ", ram=" + ram + "]";
	}
}
class Pen
{
	double cost;
	String colour;
	public Pen(double cost, String colour)
	{
		this.cost=cost;
		this.colour=colour;
		
	}
	public String toString()
	{
		return "Pen[cost=" + cost + ", colour=" + colour + "]";
	}
}


