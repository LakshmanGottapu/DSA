package sorted_arrays;

public class TwoDArray_2 {
	public static void main(String[] args) {
		int[][] matrix = {{10,20,30,40},
						  {15,25,35,45},
						  {28,29,37,49},
						  {33,34,38,50}};
		int num = 37;
		System.out.println(search(matrix,num));
	}

	private static String search(int[][] matrix, int num) {
		int row = 0;
		int col = matrix[row].length-1;
		while(row<matrix.length && col>=0) {
			if(num>matrix[row][col]) row++;
			else if(num<matrix[row][col]) col--;
			else 
				return String.valueOf(row)+"*"+String.valueOf(col);
		}
		return "notFound";
	}
}
