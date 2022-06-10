package arrays_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItems {
	
	static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		
int result =0  ; 
		
		int index =0 ;
		
		if(ruleKey.equals("type")) {
			index = 0;
		}
		else if ( ruleKey.equals("color")) {
			index = 1;
		}
		else {
			index = 2;
		}
		for(int i =0 ; i< items.size() ; i++) {
			if(items.get(i).get(index).equals(ruleValue)) {
				
				result+=1;
				
			}
		}
		return result ;	
		
		
		
	}

	public static void main(String[] args) {
		
		List<List<String>> items = new ArrayList<List<String>>(); 
		String[] a = {"phone","blue","pixel"} ;
		String[] b = {"computer","silver","lenovo"};
		String[] c = {"phone","gold","iphone"};
		
		items.add(Arrays.asList(a));
		items.add(Arrays.asList(b));
		items.add(Arrays.asList(c));
		
		String ruleKey = "color" ;
		String ruleValue = "silver" ;
		
		int result = countMatches( items,  ruleKey,  ruleValue) ;
		System.out.println(result);
		
	}

}
