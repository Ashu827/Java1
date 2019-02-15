package javalambda8;

import java.util.function.Consumer;

public class Perform {

	public void greet(){
		System.out.println("hello");
		
	}
	
	public static void main(String[] args) {
		Perform greeter=new Perform();
		greeter.greet();
		System.out.println();
		
		 Greeting greetingFunction=()-> System.out.println("Hello");
		 greetingFunction.perform();
		 MyAddFunction addition=(int a,int b)->a+b;
		 int s=addition.add(5,6);
		 System.out.println(s);
		 MyAddFunction substraction=(int a,int b)->a-b;
		 int s1=substraction.add(5,6);
		 System.out.println(s1);
		 
	
}
	interface MyAddFunction{
		int add(int x,int y);
	}
}
			
		