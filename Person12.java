package Class;

class Person12
{ 
	Person12() 
	{ 
		System.out.println("Person class Constructor"); 
	} 
} 

class Student12 extends Person12 
{ 
	Student12() 
	{ 
				super();  //super  

		System.out.println("Student class Constructor"); 
	} 
} 


class Test21 
{ 
	public static void main(String[] args) 
	{ 
		Student12 s = new Student12(); 
	} 
} 
