package method;

public class Method_Returning {

	public static String myname(String fName,String mName){
		String myname=fName+mName;
		return myname;
		
	}
	
	public static void main(String[] args) {
		System.out.println(myname("Rohan"," Rajendra"));
		String fullname=myname("Rohan"," Rajendra")+ "Bongale";
		System.out.println(fullname);

	}

}
