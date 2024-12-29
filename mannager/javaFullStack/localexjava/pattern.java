public class pattern {
	public static void main(String[] args) {
		for(int i=0 ; i <= 20; i++){
			for(int j=0 ; j<=20; j++){
				if(i==0||j==0||i==20||j==20||i==j||i+j==21||i+j==11||i+j==30||i==j-10||j==i-10||i==5||i==15||j==5||j==15){
					System.out.print(" *");
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}