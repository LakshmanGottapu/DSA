package sorted_arrays;

public class CeilingCharacter {

	public static void main(String[] args) {
		char[] letters = {'f', 'j', 'k'};
		char target = 'l';
		System.out.println(ceilingCharacter(letters, target));
	}

	 static char ceilingCharacter(char[] letters, char target) {
		int start = 0;
		int end = letters.length-1;
		int mid=0;
		boolean isPresent = false;
		boolean isAssc = letters[start] < letters[end];
		if(isAssc) {
		 while(start<=end) {
			 mid = start + (end-start)/2 ;
			if(target==letters[mid]) {
				isPresent = true; break;
			}
			else if(target > letters[mid]) 
				start = mid+1;
			else 
				end = mid-1;
		 }
		}
		else
			
		 while(start<=end) {
			 mid = start + (end-start)/2 ;
			if(target==letters[mid]) {
				isPresent = true; break;
			}
			else if(target < letters[mid]) start = mid+1;
			else end = mid-1;
		 }
			
		if(isPresent) return letters[(mid+1)%(letters.length)];
		else if(isAssc) return letters[start%letters.length];
		else return letters[end];
	 }

}
