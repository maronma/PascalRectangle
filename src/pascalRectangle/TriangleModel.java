package pascalRectangle;


public class TriangleModel {

	 int row;
	 int[][] pascal  ;// new int[data.valueOfRow() +1][];
	 
	 public TriangleModel(int height){

		
			 row = height;
			  pascal = new int[height][];
			  
			  
			  
			  for(int i=0;i<row;i++)
			  {
				  pascal[i] = new int [i+1];
				  
				  
			  }
			  

			  
	 }
	 
	 public int getValue(int row, int col){
		 
		 
		 return pascal[row][col];
	 }
	 
	 public void setValue(int row, int col, int val){
		 
		 
		 pascal[row][col]=val;
		 
	 }
	 
	
	
	public int getRowLength(int row){
		
		
		return pascal[row].length;
	}

	

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}



	


}

	  
		
		


