package arrays;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangramBySet(sentence));
	}
	public static boolean checkIfPangramBySet(String sentence) {
		char[] array = sentence.toCharArray();
		Set<Character>set = new HashSet<>();
		for(int i=0;i<array.length;i++) {
			set.add(array[i]);
		}
		if(set.size()==26) return true;
        return false;
    }
	public static boolean checkIfPangram(String sentence) {
		char[] array = sentence.toCharArray();
		int[] frequency = new int[array.length];
		for(int i=0;i<array.length;i++) {
			frequency[i] = (array[i]-a);
		}
	}

}
