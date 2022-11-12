package sorted_arrays;

import java.util.Arrays;

public class Start_End_Positions_LinearSearch {

	public static void main(String[] args) {
		int arr[] = {5,7,7,7,7,8,8,10,11,11};
		int target = 11;	
		System.out.println(Arrays.toString(startAndEndPositions(arr,target)));

	}

	private static int[] startAndEndPositions(int[] arr, int target) {
		int i=0;
		int j=arr.length-1;
		while(i<=arr.length-1 && arr[i]!=target) {
			++i;}
		
		while(j>=i && arr[j]!=target) j--;
			
		 if(i<=j)return new int[] {i,j};
		 else return new int[] {-1,-1};
	}

}
