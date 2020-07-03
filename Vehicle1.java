package Class;


public class Vehicle1 {
int maxSpeed = 120;

}
class Car1 extends Vehicle1
{
	int maxSpeed = 190;
	void display() {
		System.out.println("maximum speed : " + maxSpeed);
		System.out.println("maximum speed is : " +maxSpeed); //ambiguity for the JVM
	}
}
class Test33
{
	public static void main(String args[])
	{
		Car1 small = new Car1();
		small.display();
		
	}
}