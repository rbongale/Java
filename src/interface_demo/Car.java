package interface_demo;

public class Car implements Engine,Wheels {

	@Override
	public void startEngine() {
		System.out.println("Car Engine Started");
		
	}

	@Override
	public void noofwheels() {
		System.out.println("Car has four wheels");
		
	}
	
	

}
