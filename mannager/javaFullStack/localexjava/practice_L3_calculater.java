package calculater.nayankumar;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 'a' intezer number ");
		int a = sc.nextInt();
		System.out.println("enter 'b' intezer number ");
		int b = sc.nextInt();
		System.out.println("enter jod ke liye 1 dabaye\n or\n ghatana ke liye 2 dabaye \n or\n guna ke liye 3 dabaye \n or \n bhag ke liye 4 dabaye\n or\n shesh ke liye 5 dabaye\n "  );
		
		int op = sc.nextInt();
System.out.println ("your answer= ");
		if (op == 1) {
			int sum = a + b ;
			System.out.println(sum);
		} else if (op == 2) {
			int x = a - b;
			System.out.println(x);
		} else if (op == 3) {
			int y = a * b;
			System.out.println(y);
		}	else if (op == 4) {
			int z = a / b;
			System.out.println(z);
		} else if (op == 5) {
			int p =( a % b);
			System.out.println(p);
		} else {
			System.out.println("invalid input");
		}
	}


}