package sorted_arrays;

public class Richest_Person {

	public static void main(String[] args) {
		int[][] accounts = {{1,5},{7,3},{6,5}};
		System.out.println(maximumWealth(accounts));
	}
	public static int maximumWealth(int[][] accounts) {
		if(accounts.length==0) return -1;
		int max=Integer.MIN_VALUE;
		int sum;
		for(int i=0; i<accounts.length; i++) {
			sum = sumofArray(accounts[i]);
			if(sum>max) max = sum;
		}
		return max;
	}
		static int sumofArray(int arr[]) {
			int sum=0;
			for(int num : arr) 
				sum+=num;
			return sum;
		}
	}

