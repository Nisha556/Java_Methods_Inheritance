package Class;

public class Vehicle {
int maxSpeed = 120;

}
class Car extends Vehicle
{
	int maxSpeed = 190;
	void display() {
		System.out.println("maximum speed : " + maxSpeed);
		System.out.println("maximum speed is : " +super.maxSpeed);
	}
}
class Test3
{
	public static void main(String args[])
	{
		Car small = new Car();
		small.display();
		
	}
}