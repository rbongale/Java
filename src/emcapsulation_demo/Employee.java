package emcapsulation_demo;

public class Employee {
	private String empname;
	private int empage;
	private double empsal;
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		if (empsal>=0){
		this.empsal = empsal;
			
		}
		else{
			System.out.println("Inavalid value");
		}
	}
	
	
}
