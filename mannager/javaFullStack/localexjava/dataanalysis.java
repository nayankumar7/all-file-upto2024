//Topic - Given Data Analysis.
/*
Subject - 1. ascending order
               2. mean of a data
               3. median
               4.Range
               5.Mean Deviation
               6.Mean Deviation Range
*/
import java.util.*;
public class Main {
// FUNCTION NUMBER -01 (PRNTOO)
	public static void prntoo(int num[]) {
		//input stage
		//booble sort
		for (int i = 0; i < num.length - 1; i++) {

			for (int j = 0; j < num.length - i - 1; j++) { //value change
				if (num[j] > num [j + 1]) {
					int amm = num[j] ;
					num[j] = num[j + 1];
					num[j + 1] = amm ;
				}
			}
		}

		//output Stage
		System.out.print("increasing oder : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
		System.out.println();
	}
// FUNCTION NUMBER -02 (avg)
	public static void avg(double p, int num []) {
		double fff = 0;
		double m = 0;
		for (int i = 0; i < p ; i++) {
			m = m + num[i] ;
		}
		double z = m / p ;
		System.out.print(" mean : ");
		System.out.println(z);
		double ff = 0 ;
		for (int d = 0; d < p ; d++) {
			double y = z - num[d] ;
			if (y < 0) {
				y = 0 - y ;
			}
			ff = ff +  y ;
			fff = ff / p;
		}
		System.out.println("mean division : " + fff);
		double mdr1 = z - fff;
		double mdr2 = z + fff;
		System.out.println("Mean Division Range : " + "(" + mdr1 + "," + mdr2 + ")");
	}
// FUNCTION NUMBER -03(MEDIAN)
	public static void median(int num[], int p) {
		//	System.out.println();
		int l = p;
		if (num.length % 2 == 0) {

			double k = num[(l / 2) - 1];
			double m = num[l / 2];
			double n = (k + m) / 2 ;

			System.out.println("median = " + n);
		} else {
			double o = num[l / 2];
			System.out.println("median = " + o);
		}

	}

// FUNCTION NUMBER -04 (RANGE)
	public static void range(int num[], int p) {
		double r = num[0];
		int t = p - 1;
		double s = num[t];

		System.out.print("range =   (" + r + " , " + s + ")");
	}

// main function -->

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements : ");
		int p = sc.nextInt();//p is no. of elments.

		int [] num = new int [p];// num is Arraylist and p denote size of arraylist.

		for (int q = 0 ; q < p ; q++) {

			num[q] = sc.nextInt();//list of elements
		}

		prntoo(num);
		avg(p, num);
		median(num, p);
		range(num, p);
	}
}