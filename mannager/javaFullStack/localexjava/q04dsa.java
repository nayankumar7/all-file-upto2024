public class Main {
	public static boolean arr(){
	   	    int ary [] = {2,5,9};
	   	boolean   a =false;
	   	    
	   	    for(int i =0 ; i <ary.length-1;i++){
	        for(int j = i+1; j < ary.length;j++){
	            if(ary[i]==ary[j]){
	               a= true;
	                return a ;     
	          }    
	        }
	         
	    }  
	    
	    return a ;
	}
	

	public static void main(String[] args) {
	       boolean a=arr();
	    System.out.println(a);

	}
}