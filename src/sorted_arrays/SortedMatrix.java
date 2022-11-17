package sorted_arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{ 1, 2, 3, 4},
						  { 5, 6, 7, 8}
						  };
		System.out.println(search(matrix,5));
	}
	private static int rowSearch(int[] row, int target, int col1, int col2) {
		int start = col1;
		int end = col2;
		while(start<=end) {
			int mid = start + (end-start)/2 ;
			if(target>row[mid]) start = mid+1;
			else if(target<row[mid]) end = mid-1;
			else return mid;
		}
		return -1;
	}
	private static String search(int[][] matrix, int target) {
		int rowLength = matrix.length;
		int sRow = 0;
		int eRow = rowLength-1;
		int mCol = (matrix[0].length-1)/2;
		while(sRow<=eRow) {
			int mRow = sRow + (eRow-sRow)/2 ;
			if(target>matrix[mRow][mCol]) {
				int result = rowSearch(matrix[mRow],target,mCol+1,matrix[mRow].length-1);
				if(result!=-1) 
					return mRow+"*"+result;
				else sRow = mRow+1;
			}
			else if(target<matrix[mRow][mCol]) {
				int result = rowSearch(matrix[mRow],target,0,mCol-1);
				if(result!=-1) {
					return mRow+"*"+result;
				}
				else eRow=mRow-1;
			}
			else return mRow+"*"+mCol;
		}
		return null;
	}
	
}
