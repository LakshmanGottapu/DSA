package sorted_arrays;

public class MountainArray_Search {

	public static void main(String[] args) {
		int[] array = {1,2,3,5,4,1};
		int target = 1;
		int start = 0;
		System.out.println(SearchMountain(array,target));
	}
	static int SearchMountain(int[] array, int target) {
		int start =0;
		int end = BitonicArray.bitonicSearch(array);
		int newStart = end+1;
		while(start<=end) {
				int mid = start + (end-start)/2; 
				if(target>array[mid])
					start = mid+1;
				else if(target<array[mid]) end = mid-1;
				else return mid;
		}
		end = array.length-1;
		while(newStart<=end) {		
			int mid = newStart + (end-newStart)/2; 
			if(target>array[mid])	   end = mid-1;
			else if(target<array[mid]) newStart = mid+1;
			else return mid;
		}
		return -1;
	}
}
