//Q- creat a user matrix and set decreasing order(1. row wise)(2. colum wise)(3.all matrix)

package nayan;
import java.util.*;

public class Main {
    //Fubction == print Array
    public static void printorder(int matrix[][],int rows,int cols){
       	for (int i = 0; i < rows; i++) {
			for (int j = 0 ; j < cols; j++) { 
			System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
			}
    }
  /*//function == creat to row wise decrease order by using bubble sort
    public static void orderRows(int matrix [] [],int rows,int cols){
        
        for (int i = 0; i < rows-1; i++) {
			for (int j = 0 ; j < cols-i-1; j++) {
			
			for(i=0; i<rows;i++){ //important becouse last element have not working to sorting in 2d array and I have no idea to solve this problem so i have used to solve another loop .then problem solved 
			
				if (matrix[i][j]<matrix[i][j+1] ){
				    	
				    //swap
				    int change = matrix[i][j];
				    matrix[i][j] = matrix[i][j+1];
				    matrix[i][j+1] = change;
				}
				}
			}
		}
    }

    //function == creat to colum wise decrease order by using bubble sort
    public static void orderCols(int matrix [] [],int rows,int cols){
        
        for (int i = 0; i < rows-1; i++) {
			for (int j = 0 ; j < cols-i-1; j++) {
			
			for(j=0; j<rows;j++){ //important becouse last element have not working to sorting in 2d array and I have no idea to solve this problem so i have used to solve another loop .then problem solved 
			
				if (matrix[i][j]<matrix[i+1][j] ){
				    	
				    //swap
				    int change = matrix[i][j];
				    matrix[i][j] = matrix[i+1][j];
				    matrix[i+1][j] = change;
				}
				}
			}
		}
    }

*/ 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int [] [] matrix = new int [rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0 ; j < cols; j++) {
				matrix [i][j] = sc.nextInt();
			}
		}
		orderRows(matrix,rows,cols);
		orderCols(matrix,rows,cols);
		
		printorder(matrix,rows,cols);
		
	}
} 