package sorted_arrays;

public class InfiniteArray {

	public static void main(String[] args) {
		int[] array = {3,5};
		int target = 2;
		System.out.println(ans(array,target));
	}
	static int ans(int[] array, int target) {
		//find the range
		//first start with a box of size 2
		int start =0;
		int end=2;
		int newStart;
		//condition for the target to lie in the range
		while(target>array[end]) { 
			 newStart=end+1;
		     end = end+(end-start+1)*2;
		     start = newStart;
		}
		return binarySearch(array,target,start,end);
		
	}
	 static int binarySearch(int[] array, int target, int start,int end) {

		while(start<=end) {
			int mid = start + (end-start+1)/2 ;
			if(target<array[mid]) end = mid-1;
			else if(target>array[mid]) start = mid+1;
			else return mid;
		}
		return -1;
	}

}
