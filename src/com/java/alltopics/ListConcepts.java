package com.java.alltopics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) 
	{
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(30);
	System.out.println(l);
	System.out.println(l.get(0));
	
for(Integer p:l)
{
	System.out.println(p);
}
  System.out.println("*********");
Iterator<Integer> i=l.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
l.set(1, 89);
	System.out.println(l);
	System.out.println(l.get(0));
	

	}

}
