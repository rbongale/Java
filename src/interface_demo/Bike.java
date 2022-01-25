package interface_demo;

public class Bike implements Engine, Wheels {

	@Override
	public void noofwheels() {
		System.out.println("Bike Engine Started");
	}

	@Override
	public void startEngine() {
		System.out.println("Bike has two wheels");
	}
	

}
