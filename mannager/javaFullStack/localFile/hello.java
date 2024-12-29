import java.util.Scanner;

class Solution {
    public static String largestPalindrome (int n, int k) {
        int p = n/2;
        int q = n%2;
        int r = p + q ; 
        // System.out.println(r);
         int a = 0 ;
        if(n%2==1){
            if (n==1){
               
                for(int i = 0 ; i < 10 ; i++){
                    if (i%k==0){
                        a = i ;
                    }
                }     
            }
            else{
                
            }
            System.out.println(a);
        }
        else if (n % 2 == 0 ){

        }
      
        return " " ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(largestPalindrome ( n, k));

    }
}