package com.methodoverloading;
/*
class Shape 
{
	public void area(float r)
	{
	 System.out.println("Area of Circle = "+3.14f*r*r);
	}
	
	public void area(int x)
	{
		System.out.println("Area of Square = "+x*x);
	}
	
	public void area(int x,int y)
	{
		System.out.println("Area of Rectangle = "+x*y);
	}
}

public class TestMethodOverloading 
{
	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.area(2.2f);
		s.area(5);
		s.area(2, 3);
	}
}
*/

class Shape 
{
	public void area(float r)
	{
	 System.out.println("Area of Circle = "+3.14f*r*r);
	}
	
	public void area(int x)
	{
		System.out.println("Area of Square = "+x*x);
	}
	
	public void area(int x,int y)
	{
		System.out.println("Area of Rectangle = "+x*y);
	}
}

public class TestMethodOverloading 
{
	public static void main(String[] args) 
	{
		Shape s=new Shape();
		s.area(2.2f);
		s.area(5);
		s.area(2, 3);
	}
}
