import java.util.*;
class Solution {
    public static String longestCommonPrefix(String[] strs ) {
            	
    	 String st1 = strs[0];
   
    char arr1 [] = new char [st1.length()];
    
    	 for (int j = 0 ; j < st1.length(); j++){
    	      arr1[j] = st1.charAt(j);
    
    	 	}
    	 		 String st2 = strs[1];
    
    char arr2 [] = new char [st2.length()];
    
    	 for (int l = 0 ; l < st2.length();l++){
    	     arr2[l] = st2.charAt(l);
 
    	 	}
    	 		 String st3 = strs[2];
    
    char arr3 [] = new char [st3.length()];
    
    	 for (int k= 0 ; k< st3.length(); k++){
    	     arr3 [k] = st3.charAt(k);

    	 	}
    	 	//compare arr 
    	 	String sum = "";
    	 	for (int p = 0 ; p <st1.length(); p++){
    	 		for (int q = 0 ; q<st2.length(); q++){
    	 	    	for (int r= 0 ; r<st3.length(); r++){
    	 	    if (arr3[r] == arr2[q] && arr3[r] ==arr1[p]){
    	 	      String s = Character.toString(arr3[r]); 
    	 	      sum += s ;
    	 	      
    	 	    }
    	 	}
    	 	}
    	 	}
    	 	
    	
        return sum ;
    }
    
    	public static void main(String[] args) {
    	    Scanner sc = new Scanner (System.in);
    	    
		String strs [] = new String [3];
		for(int i =0 ; i < 3 ; i++){
		    strs [i] = sc.next();
		    
		}System.out.println(longestCommonPrefix(strs));
		
	}
}