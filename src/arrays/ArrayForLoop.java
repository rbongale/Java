package arrays;

public class ArrayForLoop {

	public static void main(String[] args) {
		int[] num={10,50,40,90};
		
		System.out.println("Sequence");
		for(int i=0;i<=3;i++){
		System.out.println(num[i]);
		}
		
		System.out.println("Reverse");
		for(int i=3;i>=0;i--){
		System.out.println(num[i]);
		}
		
	}

}
