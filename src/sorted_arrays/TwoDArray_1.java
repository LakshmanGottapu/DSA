package sorted_arrays;

public class TwoDArray_1 {

	public static void main(String[] args) {
		int[][] matrix = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
		int num = 37;
		search(matrix,num);
	}

	private static void search(int[][] matrix, int num) {
		int start = 0;
		int end = 0;
		int mid = 0;
		for(int i=0;i<matrix.length;i++) {
			start = 0;
			end = matrix[i].length-1;
		  while(start<=end) {
			mid = start + (end-start)/2;
			if(num>matrix[i][mid]) start = mid+1;
			else if(num<matrix[i][mid]) end = mid-1;
			else {
				System.out.println(i+"*"+mid); break;
			}
		  }
		}
		
	}

}
