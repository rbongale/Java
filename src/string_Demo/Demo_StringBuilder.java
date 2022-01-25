package string_Demo;

public class Demo_StringBuilder {

	public static void main(String[] args) {
		StringBuilder sbld = new StringBuilder("Selenium");
		System.out.println(sbld);
		sbld.append("Java");
		System.out.println(sbld);
		sbld.reverse();
		System.out.println(sbld);
		sbld.replace(7, 10, "Python");
		System.out.println(sbld);
		

	}

}
