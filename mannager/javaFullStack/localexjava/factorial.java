/*
import java.util.*;

public class Main {

public static void factorial(int n){
		int m =1;

		for ( int i = 1 ; i<=n ; i++){
		m = m * i ;
		}
		System.out.println(m);
		return;
		}
		public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	factorial(n);

	}
}
*/

import java.util.*;

public class Main {

	public static void factorial(int n ,int f) {
	Scanner sc = new Scanner(System.in);
		 int m = 0;
	 n = sc.nextInt();
		for (int i = 1; i <= n ; i++) {
	 f = sc.nextInt();
			m = m + f ;

		}
		 int z = m/n ;
		System.out.println(z);
		return ;

	}

	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				int f = sc.nextInt();
		factorial(n,f);
	}
}
