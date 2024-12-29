 class pen extends pentype {
    String color ;
    String company ;
    int prize ;
    int dW ;
       
        void printpen() {
            System.out.println(this.color+ " - " +this.company+" - " +this.prize+" $ - " +this.dW + " m - "+this.typ );
            
        }
        void writing() {
                   System.out.println (" Writing Something ") ;
        }
}
class pentype {
    String typ ;
}
  

public class oops {
	public static void main(String[] args) {
		pen pt = new pen();
		
		
	}
}