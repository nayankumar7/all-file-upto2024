package DrNayan;
import java.util.*;
public class NayanSir {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		Q -  print this pattern
		*****
		*      *
		*      *
		*      *
		*****
		*/
// Solve -

for (int i =1; i <= 5 ; i ++){
	System.out.print("*");
}
System.out.println();
for (int j = 1 ; j<= 3 ; j++){
	System.out.println("*" + "      "+"*");
}
for (int k =1; k <= 5 ; k ++){
	System.out.print("*");
}
	}
}