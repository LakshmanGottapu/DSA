package sorted_arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{ 1, 2, 3, 4},
						  { 5, 6, 7, 8},
						  { 9,10,11,12},
						  {13,14,15,16}};
		search(matrix,10);
	}

	private static void search(int[][] matrix, int target) {
		int sRow = 0;
		int eRow = matrix.length-1;
		int sCol = 0;
		int eCol = matrix[0].length;
		while(sRow<=eRow) {
			int mRow = sRow + (eRow-sRow)/2 ;
			if(target>matrix[mRow][1]) {
				sRow = mRow;
				//sCol =
			}
			else if(target<matrix[mRow][1]) eRow = mRow;
		}
	}
	
}
