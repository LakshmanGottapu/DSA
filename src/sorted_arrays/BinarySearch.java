package sorted_arrays;

public class BinarySearch {

	public static void main(String[] args) {
	 int[] inputArray = {2,3};
	 				//	{0,1,2,3, 4, 5, 6, 7, 8, 9};
	//System.out.println(search(14,inputArray));
	 System.out.println(binarySearch(1,inputArray));
	}
	 
	 static int binarySearch(int num,int[] array) {
		 int start=0;
		 int end=array.length-1;
			while(start<=end) { //{2,3} ; target = 1;
				                //{0,1,2,3, 4, 5, 6}
				int mid = start + (end-start)/2; 
				if(num<array[mid]) 
					end = mid-1;
				else if(num>array[mid]) start = mid+1;
				else return mid;
			}
			return -1;
		}
}
