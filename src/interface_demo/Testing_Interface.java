package interface_demo;

public class Testing_Interface {

	public static void main(String[] args) {
		Car objcar = new Car();
		Bike objbike = new Bike();
		
		objcar.startEngine();
		objcar.noofwheels();
		objbike.startEngine();
		objbike.noofwheels();

	}

}
