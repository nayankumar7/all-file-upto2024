//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
// User function Template for Java

/*
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

Java users need to return result in Pair class
For Example -> return new Pair(minimum,maximum)
*/

import org.javatuples.Pair;
class Solution {
    public Pair<Long, Long> getMinMax(int[] arr) {
       
        // Code Here
        for (int i = 0 ; i< arr.length ; i ++){
            for (int j = 0 ; j < arr.length -i-1; j ++){
                if (arr[j]<arr[j+1 ]){
                    int temp = arr [j];
                     arr[j] = arr[j+1];
                     arr[j+1 ] = temp ;
                    
                }
            }
            
        }
         Pair<Long, Long> pair
            = new Pair<Long, Long>(Long.valueOf(arr[0]), Long.valueOf(arr[arr.length-1]));
        return pair;
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int al = sc.nextInt();
        int arr []= new int[al];
    }
    }



//{ Driver Code Starts.
