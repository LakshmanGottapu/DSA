package sorted_arrays;

public class BitonicArray {

	public static void main(String[] args) {
	int[] array = {1,2,3,4,5,4,3,2};
	System.out.println(bitonicSearch(array));
	}

    static int bitonicSearch(int[] array) {
		int start = 0;
		int end = array.length-1;
		int mid=0;		   //{0,1,2,3,4,5,6,7} - index
		while(start<end) { //{2,3,4,5,4,3,2,1}
			mid = start + (end-start)/2 ;
			if(array[mid]>array[mid+1]) 
				end = mid;
			else  { 
				//you are in assc part of array
				start = mid+1; //because we know that mdi+1 element > mid element
			}
		}
		return start;
	}
	
}
