import java.util.*;
public class radius {
public static void crc(float r){
	double pi = 3.14;
	double c = 2*pi*r;
	System.out.println(c);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		crc(r);
		
	}
}