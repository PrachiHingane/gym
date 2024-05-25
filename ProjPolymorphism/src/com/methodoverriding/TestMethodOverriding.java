package com.methodoverriding;
/*
class Vehicle
{
	public void display()
	{
		System.out.println("from vehicle");
	}
}

class Car extends Vehicle
{
	public void display()
	{
		super.display();
		System.out.println("from car");
	}
}

public class TestMethodOverriding 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.display();
	}
}
*/


class Vehicle
{
	public Vehicle display()
	{
		return new Vehicle();
	}
	void msg()
	{
		System.out.println("inside Vehicle");
	}
}

class Car extends Vehicle
{
	public Car display()
	{
		return new Car();
	}
	void show()
	{
		System.out.println("inside Car");
	}
}

public class TestMethodOverriding 
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.display().show();
		c.display().msg();
	}
}

