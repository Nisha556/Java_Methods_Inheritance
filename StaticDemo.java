package Class;

class StaticDemo {
static int a = 42;
static int b = 99;
static void callme()
{
	int a = 53;
	System.out.println("value of a = " +a);
	
}

}
class StaticByName {
public static void main(String args[]) {
StaticDemo.callme();

System.out.println("a = " +StaticDemo.a);
System.out.println("b = " + StaticDemo.b);
}
}