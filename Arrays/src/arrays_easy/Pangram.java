package arrays_easy;

import java.util.Arrays;

public class Pangram {
	
	static boolean checkIfPangram(String sentence) {
		int[] result = new int[26] ;
		for(int i= 0 ; i<sentence.length() ; i ++) {
			int count = 0;
			result[sentence.charAt(i) - 'a'] = ++count ;  

		}
		System.out.println(Arrays.toString(result));
		for(int j= 0 ; j<26 ; j++) {
			if(result[j] == 0) {
				return false ; 
			}
		}
		return true ;
	}
	
	
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog" ;
		boolean result = checkIfPangram(sentence);
		System.out.println(result);
	}

}
