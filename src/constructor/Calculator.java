package constructor;

public class Calculator {
	
	int i;
	int j;
	int k;
	
	
	public Calculator(int passedi, int passedj){
		System.out.println("I am a constructor");
		this.i=passedi;
		this.j=passedj;
	}
	
	public Calculator(int passedi, int passedj, int passedk){
		System.out.println("I am a constructor");
		this.i=passedi;
		this.j=passedj;
		this.k=passedk;
	}
	
	public void sumofthree(){
		System.out.println("Sum :" + (i+j+k));
	}
	public void sum(){
		System.out.println("Sum :" + (i+j));
	}
	
	public void sub(){
		System.out.println("Sub :" + (j-i));
	}

}
