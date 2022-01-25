package exceptional_handling;

public class Demo2 {

	public static void main(String[] args) {
			System.out.println("Program Started!");
			int arr[]={10,30,40};
			try{
			int i= arr[4]/0;
			}
			catch (ArithmeticException E){
				System.out.println("Number caannot be" + E.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException E){
				System.out.println("Number doesnt exist at index :" + E.getMessage());
			}
			catch (Exception E){
				System.out.println("I am parent Exception");
			}
			finally{
				System.out.println("I will always execute");
			}
			System.out.println("Program Ended");

	}

}
