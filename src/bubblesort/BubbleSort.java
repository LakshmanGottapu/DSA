package bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {5};
		System.out.println(Arrays.toString(sortAssc(array)));
	}

	private static int[] sortAssc(int[] array) {
		int temp;
		int count=1;
		int length = array.length;
		int end=length-1;
		boolean swap = false;
	    while(end>0) {
			for(int i=1;i<=end;i++) {
				if(array[i-1]>array[i]) {
					temp = array[i];
					array[i]=array[i-1];
					array[i-1]=temp;
					swap = true;
				}
			}
			if(!swap) break;
		    end--;
		    swap = false;
	    }
	    System.out.println(end);
		return array;
	}

}
