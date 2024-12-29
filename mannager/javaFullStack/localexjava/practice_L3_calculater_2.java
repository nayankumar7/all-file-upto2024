package calculater.nayqnkumar;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter frist entezer number");
		int a = sc.nextInt();
		System.out.println("enter second entezer number");
		int b = sc.nextInt();
		System.out.println("enter jod ke liye 1 dabaye\n or\n ghatana ke liye 2 dabaye \n or\n guna ke liye 3 dabaye \n or \n bhag ke liye 4 dabaye\n or\n shesh ke liye 5 dabaye\n ");
		int c = sc.nextInt();
		System.out.print("your answer = ");
		switch (c) {
		case 1 :
			int d = a + b ;
			System.out.println(d);
			break;
		case 2 :
			int e = a - b ;
			System.out.println(e);
			break;
		case 3 :
			int f = a * b ;
			System.out.println(f);
			break;
		case 4 :
			int g = a / b ;
			System.out.println(g);
			break;
		case 5 :
			int h = a % b ;
			System.out.println(h);
			break;

		default :
			System.out.println("invalid input");
		}
System.out.println("thank you");
		}
}