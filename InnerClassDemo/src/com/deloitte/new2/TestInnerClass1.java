package com.deloitte.new2;

interface Inter1{
	// void show();   		1
	// void show(int i);	2
	int sum(int i, int j);   // 3
}

/*class MyClass implements Inter1{
 	@Override
 	public void show(){
		System.out.println("Hello");
 	}
}
*/

public class TestInnerClass1 {

	public static void main(String[] args) {
/*		Inter1 i1= new Inter1() 
		{												// Anonymous Class
			public void show()
			{
			System.out.println("Hello");
			}
		};
*/
		//Inter1 i1=() -> System.out.println("Hello");  // ->  Lambda Expression.		1
		//Inter1 i1=(i) -> System.out.println("i = "+i);								2
		//i1.show();					1
		//i1.show(5);					2
		Inter1 i1 = (i,j) -> {
								System.out.println("Adding.. ");
								return i+j;
							};
			System.out.println(i1.sum(5,6));
		}
	}


