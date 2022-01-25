package method;

public class Calculator {

	static void sum(int x, int y){
		int sum=x+y;
		System.out.println("Sum of two mumbers is :" +sum);
	}
	
	static void mult(int x, double y){
		System.out.println("Multiplication of two mumbers is :" +(x*y));
	}
	
	static void sub(int x, int y){
		System.out.println("Substraction of two mumbers is :" +(x-y));
	}
	
	
	public static void main(String[] args) {
		sum(10,50);
		mult(10,30.5);
		sub(108,50);

	}

}
