import java.util.*;
class Solution {
    public static int partition(int mergedArray[], int low, int high){
        int pivot = mergedArray[high]; 
        int z = (low-1);
        for (int y=low; y< high ; y++){
            if (mergedArray[y] < pivot){
                z++;
                int temp = mergedArray[z];
                mergedArray[z] = mergedArray[y];
                mergedArray[y] = temp;
            }
        }
        z++;
        int temp = mergedArray[z];
        mergedArray[z] = pivot;
        mergedArray[high] = temp;

        return z;
    }
    public static void quickSort (int mergedArray[], int low, int high){
        if (low < high){
            int pi = partition(mergedArray, low, high);
            quickSort (mergedArray, low, pi-1);
            quickSort (mergedArray, pi+1, high);
        }
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = 0.00 ;
        
        return median ;
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        
        int nums1 [] = new int [m];
        for(int i = 0 ; i <m ; i++){
            nums1 [i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int nums2 [] = new int [n];
        for(int j = 0 ; j <n ; j++){
            nums2 [j] = sc.nextInt();
        }
        int mergedArray [] = new int [m+n];
        for (int k = 0 ; k < m+n ; k++){
            if (k < m){
                 mergedArray[k] = nums1[k];
            }
            else {
                mergedArray[k] = nums2[k-m];
            }
           
        }
        // for (int s = 0 ; s < m+n ; s++){
        //     System.out.println(mergedArray[s]);
        // }
        // shorting
        

    
        quickSort (mergedArray, 0, m+n-1);
        for(int x = 0 ; x<m+n; x++){
            System.out.println(mergedArray[x] + " ");
        }
    }
}