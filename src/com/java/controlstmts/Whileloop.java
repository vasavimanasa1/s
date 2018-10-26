package com.java.controlstmts;

public class Whileloop {

	public static void main(String[] args)	
	{
	   int i=0;
	   while(i<=6)
	   {
		   System.out.println("While executed"+i);
		   i++;//If we won't increment the variable while executes infinte times....
		   //this is called STACK OVERFLOW EXCEPTION
		   
		   
	   }
System.out.println("While doesn't execute");
	}

}
