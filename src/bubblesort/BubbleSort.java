package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {9,6,2,3,8,5};
		System.out.println(Arrays.toString(sortAssc(array)));
	}

	private static int[] sortAssc(int[] array) {
		int temp;
		int count=1;
		int length = array.length;
		int end=length-1;
	    while(end>0) {
			
			for(int i=0;i<end;i++) {
				if(array[i]>array[i+1]) {
					temp = array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
			}
		    end--;
	    }
		return array;
	}

}
