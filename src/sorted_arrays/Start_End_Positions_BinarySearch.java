package sorted_arrays;

import java.util.Arrays;

public class Start_End_Positions_BinarySearch {
	public static void main(String[] args) {
	int arr[] = {5,5,5,7,7,7,7,8,8,10,11,11,12};
	int target = 5;	
	System.out.println(Arrays.toString(search(arr,target)));
	}
	 static int[] search(int[] arr, int target) {
		 int[] ans = {-1,-1};
		 ans[0] = startAndEndPositions(arr,target,true);
		 if(ans[0]!=-1)
		 ans[1] = startAndEndPositions(arr,target,false);
		 return ans;
	 }
	static int startAndEndPositions(int[] arr, int target, boolean isFirstIndex) {
		int start = 0;
		int end = arr.length-1;
		int mid=0;
	  while(start<=end) {
		mid = start + (end-start)/2 ;
		if(target>arr[mid]) start= mid+1;
		else if(target<arr[mid]) end = mid-1;
		else {
			if(isFirstIndex) {
				end=mid-1;
			}
			else start=mid+1;
		}
	  }
	  if(isFirstIndex) return start;
	  else return end;
	}	
}