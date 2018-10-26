package com.java.alltopics;

public class DataTypes
{
	{System.out.println("manasa");}
	int i;//non static global
	short s;//non static global
	byte b;//non static global
	long l;//non static global
	char c=65;//non static global
	static int p;
	static short ss;
	static byte sb;
	static long sl;
	static char sc;
	static String sss;
	

	public static void main(String[] args)
	{
		int i1=8;
		
		DataTypes dt=new DataTypes();
		
		System.out.println("NON STATIC VARIABLES ACCESSING THROUGH refernce vriable");
		System.out.println(dt.i);
		System.out.println(dt.s);
		System.out.println(dt.b);
		System.out.println(dt.l);
		System.out.println(dt.c);
		
		
		System.out.println("STATIC VARIABLES ACCESSING");
		
		System.out.println(p);
		System.out.println(ss);
		System.out.println(sb);
		System.out.println(sl);
		System.out.println(sc);
		System.out.println(sss);

	}

}
