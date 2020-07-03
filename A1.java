package Class;

public class A1 {
A1()
{
	System.out.println("A's class constructor");
	
}
}
class B1 extends A1
{
	B1()
	{
		
		System.out.println("B's class constructor");
	
		
	}

	
}

class C1 extends B1
{
C1()
{

System.out.println("C's class constructor");

}
}
class Test23
{
	public static void main(String args[])
	{
		C1 c = new C1();
		
	}
}