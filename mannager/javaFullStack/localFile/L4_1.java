//challenge- mind
// 1.print a word given user
//2. jitane baare user us word print karana chahta hai vah kara sakta hai
//3. user ko yah bataye ki kaun sa word kitane baar print huaa matlab usse pahale uska type number
package self.challengeNayankumar;

import java.util.*;

public class challengeByMind {
	public static void main(String[] args) {

		System.out.print("please enter word or sentences  : ");

		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();

		System.out.println("please enter number of times repeat :");

		int n = sc.nextInt();


		for (int i = 1; i <= n ; i++) {
			System.out.println(i + " " + word);
		}


	}
}