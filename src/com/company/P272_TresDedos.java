import java.util.Scanner;

public class P272_TresDedos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numVeces = sc.nextInt();
		int num,numAux;
		
		for (int i = 0; i < numVeces; i++) {
			String res = "";
			String resAux = "";
			num = sc.nextInt();
			numAux = num;
			if (num >= 6) {
				do {
					
					resAux += Integer.toString(numAux % 6);
					numAux = numAux / 6;
					
				} while (numAux >= 6);
				
			}
			
			resAux += Integer.toString(numAux);
			
			for (int j = resAux.length(); j > 0; j--) {
				res += resAux.substring(j-1,j);
			}
						
			System.out.println(res);
			
		}
		
	}

}
