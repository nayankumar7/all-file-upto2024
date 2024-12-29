import java.util.*;
import java.io.*;
class Solution {
    public static void letterCombinations(String digits) {
        String arr [] = new String [digits.length()];
        for(int i = 0 ; i < digits.length();i++){
            char j = digits.charAt(i) ; 
            // System.out.println(j);

       
   
           arr [i] = valueOfNum(j) ;

        }
        LinkedList <String> list= new LinkedList <String>();
        for(int k =0 ; k < arr.length;k++){
            String m = arr[k];
            for (int n = 0 ; n< m.length();n++){
                char o = m.charAt(n);
                // System.out.println(o);
                String p = Character.toString(o);
                list.add(p);


            }
        }
        System.out.println(list);
        LinkedList <String> list2= new LinkedList <String>();
        // use trie data sructure 
        // for(int q = 0 ; q < list.size();q++){
        //     for (int r = 0 ; r<= digits.length();r++){
                
        //     }

        // }
        
    }
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
        String digits = sc.next();
        letterCombinations( digits);
    }
    public static String valueOfNum(char num){
        if(num == '2'){
            return "abc";
        }
        else if (num == '3'){
            return "def";
        }
        else if (num == '4'){
            return "ghi";
            
        }
        else if (num == '5'){
            return "jkl";
        }else if (num == '6'){
            return "mno";
        }else if (num == '7'){
            return "pqrs";
        }else if (num == '8'){
            return "tuv";
        }else if (num == '9'){
            return "wxyz";
        } 
        return "";
        
    }
}