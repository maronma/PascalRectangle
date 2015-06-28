package pascalRectangle;

import java.util.Scanner;
	
public class Controler {
	
	int RecknagleRow;
	
	public static void main(String[] args) {
		
		
		System.out.println("Podaj liczbe wierszy");
		Scanner scanner = new Scanner(System.in);	
		
		int size=scanner.nextInt();
		
		
		TriangleModel triangle =
		NewtonTriangleFactory.getTriange(size);
		
		View.showTriangle(triangle);
		scanner.close();
		
		
		
	}
	
	
	
	
	
	
	
	

}
