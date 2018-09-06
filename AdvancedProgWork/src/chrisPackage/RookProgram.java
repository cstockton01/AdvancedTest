package chrisPackage;

public class RookProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]  RookArray  =  {  
				{ 0, 1, 0, 0},
                { 0, 0, 1, 0},
                { 1, 0, 0, 0},
                { 0, 0, 0, 1}
             };
	
		rooksAreSafe(RookArray);
	}

public static void rooksAreSafe(int[][] a) {
	
	int rowTrack = 0;
	for (int i = 0; i < a.length; i++){
		for ( int j = 0; j < a.length; j++ ){
			if (a[i][j] > 0) {
				rowTrack++;
				if (rowTrack > 1) {
					System.out.println("False! Not Safe...");
				} else {
					System.out.println("Safe! The rook is okay.");
				}
				rowTrack--;
			}
		}
		
	}
}

}
