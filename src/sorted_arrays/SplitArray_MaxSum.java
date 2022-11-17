package sorted_arrays;
//Q)Given an array 'nums' which consists of non-negative integers and an integer 'm', you can split the
//array into m non empty continous subarrays. Write an algorithm to minimize the largest sum among these
//m subarrays.
public class SplitArray_MaxSum {

	public static void main(String[] args) {
		int[] nums = {7,2,5,10,8};  //ascending order {2,5,7,8,10}
		int m = 3;
		System.out.println(splitArray(nums,m));
	}
	public static int splitArray(int[] nums, int m) {
		int start = 0;
		int end = 0;
		for(int num : nums) {
			start = Math.max(start, num);
			end += num;
		}
		while(start<end) {
			int mid = start + (end-start)/2;
			int pieces = 1;
			int sum = 0;
			for(int num : nums) {
				if(sum+num > mid) {
					pieces++;
					sum = num;
				}
				else {
					sum += num;
				}
			}
			if(pieces>m) 
				start = mid+1;
			else
				end = mid;
		}
		return end;
	}

}
