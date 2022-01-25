package objectoriented;

public class Calculator {
	int x;
	int y;
	
	void sum(){
		System.out.println("Sum is  :" +(x+y));
	}
	void sub(){
		System.out.println("Subtraction is  :" +(x-y));
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Calculator obj1=new Calculator();
		obj1.x=100;
		obj1.y=20;
		obj1.sum();
		obj1.sub();
		
		Calculator obj2=new Calculator();
		obj2.x=90;
		obj2.y=60;
		obj2.sum();
		obj2.sub();

	}

}
