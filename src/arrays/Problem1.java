package arrays;
//https://leetcode.com/problems/create-target-array-in-the-given-order/submissions/
import java.util.Arrays;
public class Problem1 {
	public static int[] shiftArray(int[] target,int val,int index) {
		
		for(int i=target.length-1;i>index;i--) {
			target[i] = target[i-1];
		}
		target[index] = val;
		return target;
	}
	public static int[] createTargetArray(int[] nums, int[] index) {
		int[] target = new int[nums.length];
		Arrays.fill(target, -1);
		for(int i=0; i<nums.length;i++) {
			int res = target[index[i]];
			if(res==-1)
			target[index[i]] = nums[i];
			else target = shiftArray(target,nums[i],index[i]);
		}
		return target;
	}
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		System.out.println(Arrays.toString(createTargetArray(nums,index)));
	}
}

