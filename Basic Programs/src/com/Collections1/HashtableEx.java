package com.Collections1;

import java.util.Hashtable;

public class HashtableEx {

	public static void main(String[] args) 
	{
	Hashtable h=new Hashtable();
	h.put(new Temp1(5),"A");
	h.put(new Temp1(2),"B");
	h.put(new Temp1(6),"C");
	h.put(new Temp1(15),"D");
	h.put(new Temp1(23),"E");
	h.put(new Temp1(16),"F");
	System.out.println(h);
	
	}
}
class Temp1
{
	int i;
	public Temp1(int i) 
	{
		this.i=i;
	}
	public int hashCode()
	{
		return i;
	}
	public String toString() {
		
		return i+"";
	}
	}
