package sorted_arrays;

import java.util.Arrays;

public class Start_End_Positions {

	public static void main(String[] args) {
		int arr[] = {5,7,7,7,7,8,8,10};
		int target = 7;	//output = [3,4].
		System.out.println(Arrays.toString(startAndEndPositions(arr,target)));
	}

	 static int[] startAndEndPositions(int[] arr, int target) {
		int start = 0;
		int end = arr.length-1;
		int mid = 0;
		int i=-1;
		int j=-1;
		boolean isPresent = false;
		while(start<=end) {
			mid = start + (end-start)/2 ;
			if(target==arr[mid]) {
			 isPresent = true; break;
			}
			else if(target>arr[mid]) start = mid + 1;
			else end = mid - 1;
		}
		if(isPresent) {
			i = mid;
		    j = mid;
			try{while(arr[i-1]==arr[mid] ) --i;}
			catch(ArrayIndexOutOfBoundsException e) {}
			try{while(arr[j+1]==arr[mid]) ++j;}
			catch(ArrayIndexOutOfBoundsException e) {}
			return new int[]{i,j};
		}
		else return new int[]{i,j};
	}

}
