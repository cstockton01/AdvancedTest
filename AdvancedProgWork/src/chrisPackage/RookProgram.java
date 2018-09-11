package chrisPackage;

public class RookProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test Comment! I AM HERE
		
		int[][]  RookArray  =  {  
				{ 0, 0, 1, 0},
                { 0, 1, 0, 0},
                { 1, 0, 0, 0},
                { 0, 0, 0, 1}
             };
	
		if (rooksAreSafe(RookArray) == true){
			System.out.print("True");
		} else {
			System.out.print("False");
		}
		
	}

public static boolean rooksAreSafe(int[][] a) {
	
	int sum = 0;
	
	//Get the sum of each row and test it to see if another rook (another 1) is in the row.
	for (int row = 0; row < a.length; row++) {
		int sumRow = 0;
		
		for (int col = 0; col < a[row].length; col++) {
			sumRow = sumRow + a[row][col];
			//If the col has multiple 1's in it. Return fail...
			if (sumRow > 1)	
			return false;
		}
	}
	
	//Get the sum of each col and test it to see if another rook (another 1) is in the col.
	for (int col = 0; col < a.length; col++) {
		int colRow = 0;
		
		for (int row = 0; row < a[col].length; row++) {
			colRow = colRow + a[row][col];
			//If the col has multiple 1's in it. Return fail...
			if (colRow > 1)	
			return false;
		}
	}
	
	return true;
}

}
