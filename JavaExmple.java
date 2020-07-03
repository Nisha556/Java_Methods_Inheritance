package Class;


class JavaExample{
	   
	   static int var1=77; 
	  
	   String var2;

	   public static void main(String args[])
	   {
		JavaExample ob1 = new JavaExample();
		JavaExample ob2 = new JavaExample();
		JavaExample ob3 = new JavaExample();
		JavaExample ob4 = new JavaExample();
		JavaExample ob5 = new JavaExample();
		
			      
		ob1.var1=77;
		ob1.var2="I'm Object1";
	        
	        ob2.var1=99;
		ob2.var2="I'm Object2";
		
		ob3.var1= 100;
		ob3.var2 = "I'm Object3";
		
		ob4.var1 = 120;
		ob4.var2 = "I'm Object3";
		System.out.println("ob1 integer:"+ob1.var1);
		System.out.println("ob1 String:"+ob1.var2);
		System.out.println("ob2 integer:"+ob2.var1);
		System.out.println("ob2 STring:"+ob2.var2);
		System.out.println("ob2 STring:"+ob3.var1);
		System.out.println("ob2 STring:"+ob3.var2);
		System.out.println("ob2 STring:"+ob4.var1);
		System.out.println("ob2 STring:"+ob4.var2);
		System.out.println("ob2 STring:"+ob5.var1);
		System.out.println("ob2 STring:"+ob5.var2);
	   }
	}