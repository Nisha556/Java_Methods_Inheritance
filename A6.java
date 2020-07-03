package Class;


class A6{
final void meth() {
System.out.println("This is a final method.");
}
}
class B6 extends A6 {
void meth() { // ERROR! Can't override. Because meth is final methofd.
System.out.println("Illegal!");
}
}