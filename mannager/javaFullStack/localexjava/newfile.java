public class Main {
	public static void main(String[] args) {


		System.out.println("home \n ");
		
		for (int x = 1 ; x <= 6 ; x ++) {
			for (int y = 1 ; y <= 45 ; y++) {
				if (x + y <= 6 ) {
					System.out.print("  ");
				} else if (x == 1 || x == 6 || y == 1 || y == 45|| y ==36 || y == 35) {
					System.out.print("b");
				}	else {
					System.out.print("a");
				}
			}
			System.out.println();
		}
		
		for (int x = 1 ; x <= 3 ; x ++) {
			for (int y = 1 ; y <= 45 ; y++) {
				System.out.print("a");
			}
	System.out.println();

		}
		
	}
}