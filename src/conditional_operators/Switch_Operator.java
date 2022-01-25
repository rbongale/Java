package conditional_operators;

public class Switch_Operator {

	public static void main(String[] args) {
		char grade ='A';
		
		switch (grade){
		case 'A' :
		System.out.println("Excellent");
		break;	
			
		case 'B' :
		System.out.println("Well Done");
		break;
			
		case 'C' :
		System.out.println("Better Try Again");
		break;
			
		default :
			System.out.println("Enter Valid Grade");
			
		}

	}

}
