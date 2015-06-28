package pascalRectangle;

public class NewtonTriangleFactory {

	public static TriangleModel getTriange(int size) {
		// TODO Auto-generated method stub
		    
		
		TriangleModel trojkat;
		
		trojkat = new TriangleModel(size);
		
		
		
		trojkat.setValue(0, 0, 1);
		
		trojkat.setValue(1, 0, 1);
		trojkat.setValue(1, 1, 1);
		
	    for (int i = 2; i < size; i++) {
	       
	        for (int j = 1; j < trojkat.getRowLength(i) - 1; j++) {
	        	trojkat.setValue(i, 0, 1);
	        	trojkat.setValue(i, trojkat.getRowLength(i)-1, 1);
	        	
	            trojkat.setValue(i,j,trojkat.getValue(i-1, j-1)+ trojkat.getValue(i-1,j));
	            }
	    }		
		return trojkat;
	}	
}
