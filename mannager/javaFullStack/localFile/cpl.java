import java.util.Scanner;

class Solution {
    // public String largestPalindrome (int n, int k) {
      
    //     return " " ;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = n/2;
        int q = n%2;
        int r = p + q ; 
        System.out.println(r);

    }
}