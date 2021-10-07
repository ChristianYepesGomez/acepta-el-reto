import java.util.Scanner;

public class P236_Ajedrez {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int granosPrimeraCasilla, multiplicador, numCasillas;
		long res, resAux;
		do {
			granosPrimeraCasilla = sc.nextInt();
			multiplicador = sc.nextInt();
			numCasillas = sc.nextInt();
			res = granosPrimeraCasilla;
			resAux = res;
			
			if (granosPrimeraCasilla != 0 && multiplicador != 0 && numCasillas != 0) {

				for (int i = 0; i < numCasillas - 1; i++) {
					resAux = resAux * multiplicador;
					res += resAux;
				}

				System.out.println(res);
			}
			
		} while (granosPrimeraCasilla != 0 && multiplicador != 0 && numCasillas != 0);
		sc.close();
	}

}
