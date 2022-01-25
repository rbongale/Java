package exceptional_handling;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Program Started!");
		try{
		int i= 10/0;
		}
		catch (ArithmeticException E){
			System.out.println("Number caannot be" + E.getMessage());
		}
		finally{
			System.out.println("I will always execute");
		}
		System.out.println("Program Ended");

	}

}
