package arrays;

public class ArrayMultiDimensional {

	public static void main(String[] args) {
		String[][] vehicles={ {"TVS","HONDA"},{"BMW","SKODA"},{"Atlas","Hero"} };
		
		for( int i=0;i<=2;i++){
			
			for(int j=0;j<=1;j++){
			
				System.out.println(vehicles[i][j]);
			}
		}
		;
	}

}
