//Name - Nayan Kumar Vishwakarma
//Subject - print 1 to n odd number.
// lets Start--->
import java.util.*; // Scanner 
public class printOdd { //class define
//function generete 
	public static void odd(int n) {
		for (int i = n ; i >= 1 ; i--) {//loop print odd number
			if(i%2==1){//odd condition
			System.out.println(i);//print
			}
		}
	}//main function
	public static void main(String[] args) {
		System.out.println("enter number of n =");//user visule
		Scanner sc = new Scanner(System.in);//install scanner
		int n = sc.nextInt();//create scanner
		odd(n);//call odd function
	}
}