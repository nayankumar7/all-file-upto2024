package junit.class01;

import java.util.LinkedList;

class Solution {
    public static void threeSum(int[] nums) {
        //i != j, i != k, and j != k, 
        for ( int i = 0; i< nums.length-2;i++){
            for( int j= 1; j <nums.length-1; j++){
                for(int k = 2;k<nums.length;k++ ){
                    if ( nums[i] + nums[j] + nums[k] == 0){
                        LinkedList List = new LinkedList<Integer>();
                         List.add(nums[i]);   
                        
                    
                    }
                }
            }
        }
    
    }
    public static void main (String args []){
        int [] nums = {0,1,1};
    }
}