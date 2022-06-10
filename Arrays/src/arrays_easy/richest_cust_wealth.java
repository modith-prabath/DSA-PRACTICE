package arrays_easy;

public class richest_cust_wealth {
	
    static int maximumWealth(int[][] accounts) {
    	int max  =0 ;
    	for (int row = 0 ; row<accounts.length ; row ++) {
    		int sum = 0;
    		for (int col = 0 ; col<accounts[row].length ; col ++) {
    			sum = sum + accounts[row][col];
    			if(sum > max) {
    				max = sum ;
    			}
    		}
    	}
    	
   
    	
        return max ;
    }
    
    public static void main(String[] args) {
		int[][] cust = { 
				{1,2,3},
				{2,3,4},
				{4,5,6}
				
		};
		System.out.println(maximumWealth( cust));
	}

}
