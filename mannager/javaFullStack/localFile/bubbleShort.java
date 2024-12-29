public class Main {
	//function = printperNM
	public static void printperNM(int perNM []) {
		for(int i =0;i<perNM.length;i++){
		    
		System.out.print(perNM[i]+" ");
		}
	}

	public static void main(String[] args) {
		int [] perNM = {80, 82, 90, 86, 89, 92, 91, 86};

		for (int i = 0; i < perNM.length - 1; i++) {
			for (int j = 0; j < perNM.length - i - 1; j++) {
				if(perNM[j]>perNM[j+1]){
				//swap
				int changer = perNM[j];
				perNM[j] = perNM[j + 1];
				perNM[j + 1] = changer;
				}

			}
		}
		printperNM(perNM);
	}
}