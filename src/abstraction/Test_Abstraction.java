package abstraction;

public class Test_Abstraction {

	public static void main(String[] args) {
		Dog objDog = new Dog();
		Cat objCat = new Cat();
		
		objDog.Sleep();
		objDog.AnimalSound();
		objCat.Sleep();
		objDog.AnimalSound();
		

	}

}
