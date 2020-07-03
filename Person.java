package Class;

public class Person {
 void message()
{
	System.out.println("This is pesron class message");
	
}
}
class student extends Person {
	void message()
	{
		System.out.println("this is student class message");
		
	}
	void display()
	{
		message();
		super.message();
		
	}
}

class test12 
{
	public static void main(String args[])
	{
		student st = new student();
	st.display();	
	}
}