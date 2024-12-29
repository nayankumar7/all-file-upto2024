package DrNayan;
import java.util.*;
public class NayanSir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter any word or speech or symbles or more  : ");
		String name = sc.nextLine();
		System.out.print("please enter intezer number of horizantal line:  ");
		int b = sc.nextInt();
		System.out.print("please enter intezer number of verticle line:  ");
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
				for (int j = 1 ; j <= b ; j++) {
				System.out.print(name + "  ");
			}
			System.out.println();
		}
	}
}