public class Pa {
	static int row = 10000;
	static int column = 10000;
	static int A[][] = new int[row][column];

	public static void main(String[] args) {
		
		long starttime = System.nanoTime();
		///** code Segment 1
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				A[i][j] = i * column + j;
			}
		}
		long endTime = System.nanoTime();
		System.out.println("Time Segment #1: " + (endTime - starttime));
		//System.out.println(endTime);
 
		long starttime2 = System.nanoTime();
		///** code Segment 2
		for (int j=0; j<column; j++) { 
			  for (int i=0; i<row; i++) { 
			    A[i][j] = i*column+j; 
			  } 
			} 

		long endTime2 = System.nanoTime();
		System.out.println("Time Segment #2: " + (endTime2 - starttime2));

	}
	
	

}
