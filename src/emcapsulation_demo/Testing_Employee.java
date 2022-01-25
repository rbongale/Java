package emcapsulation_demo;

public class Testing_Employee {
	public static void main(String args[]){
		Employee objemp = new Employee();
		
		objemp.setEmpname("Rohan Bongale");
		objemp.setEmpage(35);
		objemp.setEmpsal(50000.256);
		
		System.out.println("Empname :" + objemp.getEmpname());
		System.out.println("Empage :" + objemp.getEmpage());
		System.out.println("Empname :" + objemp.getEmpsal());
		
		System.out.println("===================================");
		
Employee objemp1 = new Employee();
		
		objemp1.setEmpname("Prasad Chavan");
		objemp1.setEmpage(36);
		objemp1.setEmpsal(-500.256);
		
		System.out.println("Empname :" + objemp1.getEmpname());
		System.out.println("Empage :" + objemp1.getEmpage());
		System.out.println("Empname :" + objemp1.getEmpsal());
		
		System.out.println("===================================");
		
		
	}

}
