package string_Demo;

public class Demo_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sbld = new StringBuffer("Selenium");
		System.out.println(sbld);
		sbld.append("Java");
		System.out.println(sbld);
		sbld.reverse();
		System.out.println(sbld);
		sbld.replace(7, 10, "Python");
		System.out.println(sbld);

	}

}
