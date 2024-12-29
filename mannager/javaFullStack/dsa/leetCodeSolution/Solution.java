// // // class Solution {
// // //     public int trap(int[] height) {

// // //         int king = height[0];
// // //         int n = height.length;
 
// // //         for (int i = 0 ; i<n ; i++){
              
// // //         }


// // //         return 0 ; 
// // //     }
// // //     public static void main(String[] args) {
// // //         int height [] = {0,1,0,2,1,0,1,3,2,1,2,1};
          
// // //     }
// // // }

// // class Solution {
// //     public static String longestCommonPrefix(String[] strs) {
// //        String s = strs[0];int sl = s.length();   
// //         for (int i = 1; i < strs.length; i++){
// //             String p = strs[i];
// //             int pl = p.length();
// //             if (pl > sl){
// //                 pl = sl; 
// //             }ss( pl, s, p);
            
// //         }
// //         return s;
// //     }
// //     public static String ss (int pl , String s, String p){
// //         for (int j = 0; j <pl;j++ ){
// //             if (s.charAt(j)==p.charAt(j)){
// //                 if (j == pl ){
// //                     s = s.substring(0,j); 
// //                 }else
// //                 {s = s.substring(0,j+1);}

// //             }else{
              
// //                if (j == 0 ){
// //                     s = "";
// //                 }else
// //                 {s = s.substring(0,j);}
// //                break;
// //             }
            
// //        }
// //         return s;
// //     }
// //     public static void main(String[] args) {  
// //         String strs [] = {"hiim","hiii","hi"};
// //         longestCommonPrefix(strs);
// //     }
// // }


// // class Solution {
// //     public static boolean isHappy(int n) {
        
        
// //         return true;
// //     }
// //     public static int ansi (String nums){
// //         int ans = 0;
    
// //         for ( int i = 0 ; i < nums.length(); i ++){
// //             String s = String.valueOf(nums.charAt(i));
// // int p = Integer.parseInt(s);

// //             ans = ans +(p*p) ;
// //         }

// //         return ans;
// //     }
// //     public static void main(String[] args) {
// //         int n = 19;
// //         String nums = String.valueOf(n);
// //         System.out.println(nums);
// //         System.out.println(ansi(nums));
// //     }
    
    

// // }


// // PROBLEM NO. 37 - SUDAKU SOLVER

// class Solution {
//     public static int givenValue(){

//         return 0 ;
//     }
//     public static void fillNums(String board[][]){
//         for (int i = 0 ; i <9; i ++){
//             for(int j = 0 ; j < 9 ; j ++){

//               int  b ;
              
//               if(board[i][j]==""){
//                 b=0;
//               }
//               else{
//                b = Integer.parseInt(board[i][j]);
                
//               }System.out.println(b);
//                     if(b==0){

//                         b=givenValue();
//                     }
                

//             }
//         }

//     }
  
//     public static void solveSudoku(char[][] board) {
        
//     }
//     public static void main(String[] args) {
//         String board [][] = {{"", "", "", "", "", "", "", "", ""}, 
//                              {"", "", "", "", "", "", "", "", ""}, 
//                              {"", "", "", "", "", "", "", "", ""},

//                              {"", "", "", "", "", "", "", "", ""},
//                              {"", "", "", "", "", "", "", "", ""},
//                              {"", "", "", "", "", "", "", "", ""},

//                              {"", "", "", "", "", "", "", "", ""},
//                              {"", "", "", "", "", "", "", "", ""},
//                              {"", "", "", "", "", "", "", "", ""}
//     };
//     fillNums(board);
//     }
// }

// p-30
class Solution {
    public class List<Integer>{
       
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        
        
    }
    public static void main(String[] args) {
        
    }
}