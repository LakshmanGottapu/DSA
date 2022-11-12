package sorted_arrays;

public class RotatedArray {

	public static void main(String[] args) {
		int[] array = {5,6,0,1,2,3,4};
		//{9,10,11,12,13,14,0,1,2,3, 4, 5, 6, 7, 8};
		//{0, 1, 2, 3, 4, 5,6,7,8,9,10,11,12,13,14}
		//{7,3,4,5,6};
		int target = 2;
		System.out.println(search(array,target));
	}

	static int findPivot(int[] array) {
		// A number with left and right elements less than it.
		 int start = 0;
		 int length = array.length;
		 int end = length-1;
		 int mid = 0;
		 while(start<=end) {
			 mid = start + (end-start)/2 ;
			 if(mid<end && array[mid]>array[mid+1]) return mid;
			 else if(mid>start && array[mid]<array[mid-1]) return mid-1;
			 else {
				 if(array[start]>array[mid]) end = mid-1;
				 else start = mid+1;
			 }
		 }
		 return -1;
	}
	
	private static int binarySearch(int[] array, int start, int end,int target) {
		while(start<=end) { //{2,3} ; target = 1;
            //{0,1,2,3, 4, 5, 6}
		int mid = start + (end-start)/2; 
		if(target<array[mid]) 
		end = mid-1;
		else if(target>array[mid]) start = mid+1;
		else return mid;
		}
	    return -1;
	}
	
	private static int search(int[] array, int target) {
		int start = 0;
		int pivot = findPivot(array);
		if(pivot==-1) return BinarySearch.binarySearch(target, array);
		int end = pivot;
		int potAns = binarySearch(array,start,end,target);
		if(potAns!=-1) return potAns;
		start = end+1;
		end = array.length-1;
		return binarySearch(array,start,end,target);
	}
	private static int rotateSearch(int[] array, int target) {
		int start = 0;
		int pivot = findPivot(array);
		int end = array.length-1;
		if(pivot==-1) return BinarySearch.binarySearch(target, array);
		
		if(target==array[pivot]) return pivot;
		else if(target>=array[start]) end = pivot-1;
		else start = pivot+1;
		
		return binarySearch(array,start,end,target);
	}
}
