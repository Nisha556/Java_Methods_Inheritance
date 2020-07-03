package Class;


class UseStatic {
static int a = 3;
static int b;
static void meth(int x) {
}
}
class StaticByName1 {
public static void main(String args[]) {
StaticDemo.callme();
System.out.println("b = " + StaticDemo.b);
}
}
