import java.util.*;
public class avg {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		int m = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n ; i++) {
			int f = sc.nextInt();
			m = m + f ;
		}
		int z = m / n ;
		System.out.println(z);

	}
}