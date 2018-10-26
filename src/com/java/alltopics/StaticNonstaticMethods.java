package com.java.alltopics;
public class StaticNonstaticMethods 
{
	static int z=10;
	int g=20;
	static int add(int a,int b) 
	{
		System.out.println("Addition of static add method is:"+(a+b));
		return a+b;
		
	}
	public int sub(int p,int q)
	{
		System.out.println("Substraction of nonstatic method is:"+(p-q));
		return p-q;
		
	}

	
public static void main (String args[])
{
	add(3,4);//accessing static method directly
	StaticNonstaticMethods k=new StaticNonstaticMethods();
	k.sub(10, 9);
	System.out.println("the static variable z ::"+z);
	System.out.println("The nonstatic variable g is:"+k.g);
	k.add(20, 10);//accessing static method through reference variable
	StaticNonstaticMethods .add(20, 30);//through class name accessing static method
	
	
}


}
