package inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		PuppyDog objpuppy = new PuppyDog();
		objpuppy.DogSound();
		objpuppy.PuppySound();
		objpuppy.sleep();
		
		Cat objcat =new Cat();
		objcat.CatSound();
		objcat.sleep();
		
		Dog objdog=new Dog();
		objdog.DogSound();
		objdog.sleep();
		
	}

}
