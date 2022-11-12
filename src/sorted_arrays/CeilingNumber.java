package sorted_arrays;

public class CeilingNumber {

	public static void main(String[] args) {
		int[] input	= //{18,16,14,9,5,3,2};
			{2,3,5,9,14,16,18};
		int target = 7;
		System.out.println(ceiling(target,input));
	}

	static int ceiling(int target, int[] input) {
		int start = 0;
		int end = input.length-1;
		int mid=0;
		boolean isPresent = false;
		boolean isAssc = input[start]<input[end];
		if(isAssc) {
		 while(start<=end) {	//{2,3,5,9,14,16,18} -7
			 					//{0,1,2,3, 4, 5, 6}
			mid = start + (end-start)/2;
			if(input[mid]==target) {
				isPresent=true; 
				break;
			}
			else if(target>input[mid]) 
				start = mid+1;
			else if(target<input[mid])
				end = mid-1;
		 }
		}
		
		else 
			 while(start<=end) {
				mid = start + (end-start)/2;
				if(input[mid]==target) {
					isPresent=true; 
					break;
				}
				if(target>input[mid]) 
					end = mid-1;
				else if(target<input[mid])
					start = mid+1;
			 }
			
		if(isPresent) return input[mid];
		else if(isAssc) return input[start];
		else return input[end];
	}

}
