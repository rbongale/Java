package string_Demo;

public class Immutable_String {

	public static void main(String[] args) {
		String s1= "Selenium";
		System.out.println(s1);
		s1.concat(s1);// as string i immutable
		System.out.println(s1);
		String s2 = s1.concat(" Java");
		System.out.println(s2);
		
	}

}
