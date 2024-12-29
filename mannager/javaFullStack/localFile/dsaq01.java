public class Main {
	public static void main(String[] args) {
		int arr [] = {7,8,3,1,2,5};
	
		for(int i =0 ; i <arr.length-1 ; i++){
		   for (int j = 0 ; j < arr.length-i-1; j++){
		       if (arr[j]>arr[j+1]){
		           //swap
		           int c = arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1]= c ;
		   }
		  } 
		}
		System.out.println(arr[0]);
				System.out.println(arr[arr.length-1]);
	}
}