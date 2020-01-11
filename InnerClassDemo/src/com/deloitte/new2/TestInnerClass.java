package com.deloitte.new2;

class Outer
{
	void OuterMethod()
	{
		System.out.println("From Outer");
	}


	static class Inner
	{
		void InnerMethod()
		{
			System.out.println("Inner Method");
		}
	}
}
public class TestInnerClass 
{

	public static void main(String[] args)
	{
		Outer outerobj = new Outer();
		outerobj.OuterMethod();
		//
		Outer.Inner innerObj =  new Outer.Inner();  
		Outer.Inner innerobj= new Outer.Inner();
		innerobj.InnerMethod();
	}

}
