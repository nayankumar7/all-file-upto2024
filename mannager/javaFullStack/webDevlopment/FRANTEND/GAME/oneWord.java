import java.util.Random;
import java.util.Scanner;

/**
 * oneWord
 */

public class oneWord {
    public static char words (){
        char arr []= {'a','b','c','d','e','f','g','h', 'i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','1','2','3','4','5','6','7','8','9','0','A','S','D','F','Z','X','C','V','Q','W','E','R','Y','H','N','U','J','M','I','K','O','L','P','T','G','B'};
        Random random = new Random();
        int select = random.nextInt(arr.length); 
        
        char ip = arr[select];
       


        return ip;

    }
    public static void prints() {
        System.out.println(words());

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println(c);
        if ((char) words() == (char)c){
            System.out.println("test passed");
            
        }
        prints();



    }

    public static void main(String[] args) {
        prints();
        
       
        
         // randomly selects an index from the arr
         

         // prints out the value at the randomly selected index
        
         
         
         

         
    
    }
}