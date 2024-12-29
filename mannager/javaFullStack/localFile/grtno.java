package nayan.nkv;
//Name -Nayan kumar vishwakarma
//Subject - great number print.
import java.util.*;
public class grtno {//define class
//new function genrate called grt.
public static void grt(int a , int b){
	if(a<b){
		System.out.println(b);
		}	else if(a>b){
		System.out.println(a);
		}
}
// main function
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		grt(a,b);
	}
}