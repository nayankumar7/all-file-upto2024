public class Main {
	public static void main(String[] args) {
		int arr [] = {5,7,9,8,3};
		  int aar [] = new int [arr.length];
		for(int i =0; i<arr.length;i++){
		  aar[i]=arr[arr.length-1-i];
		    	System.out.println(aar[i]);
		}
	
	}
}