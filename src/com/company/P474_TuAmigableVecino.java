import java.util.Scanner;

public class P474_TuAmigableVecino {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numeroVeces, posSpiderman, bombaA, bombaB, res,menor,mayor;

		numeroVeces = sc.nextInt();

		for (int i = 0; i < numeroVeces; i++) {
		
			res = 0;
			posSpiderman = sc.nextInt();

			bombaA = sc.nextInt();
			bombaB = sc.nextInt();
			
			  if (Math.abs((posSpiderman - bombaA)) < Math.abs((posSpiderman - bombaB))) {
		            menor = bombaA;
		            mayor = bombaB;
		        } else {
		            menor = bombaB;
		            mayor = bombaA;
		        }

		        res += Math.abs((posSpiderman - menor));
		        res += Math.abs((menor - mayor));
				
			System.out.println(Math.abs(res));
		}

	}

}
