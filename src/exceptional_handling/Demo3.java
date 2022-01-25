package exceptional_handling;

public class Demo3 {

	public static void main(String[] args) {
		
		double balance= 10000;
		double withdrawamount=12000;
		if (balance<=withdrawamount){
			try {
				throw new Exception("Balance is less than withdrawn amount");
				
	}
			catch (Exception E){
				System.out.println(E.getMessage());
			
			}
		}
		else {
			balance =balance-withdrawamount;
		}
		System.out.println("Program Ended");
		}

	}


