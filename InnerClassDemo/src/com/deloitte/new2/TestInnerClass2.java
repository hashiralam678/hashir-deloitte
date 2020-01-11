package com.deloitte.new2;

interface Operation{
	double operate(double a , double b);
}

class Calculation{
	double Calculate(double i, double j, Operation op) {
		return op.operate(i, j);
	}
}

class AddOperation implements Operation{
	public double operate(double a, double b)
	{
		return a+b;
	}
}
public class TestInnerClass2 {

	public static void main(String[] args) {
		Calculation cal= new Calculation();
		double a=5.6,b=6.8;
		//double sum= cal.Calculate(a, b, (x,y) -> x+y);  // 1.used when addoperation class is not included.
		Operation op= new AddOperation();
		double sum= cal.Calculate(a, b,op);
		double mul= cal.Calculate(a, b, (x,y) -> x*y);
		System.out.println("sum = " +sum);
		System.out.println("mul = " +mul);

	}

}
