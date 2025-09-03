package oops;

class MathOperation{
	
	public static int multiply(int a,int b) {
		return a*b;
	}
	
	public static double multiply(double a,double b) {
		return a*b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		
		System.out.println("Integer value: "+MathOperation.multiply(1,2));
		System.out.println("Double value: "+MathOperation.multiply(1.3,2.5));
		

	}

}

