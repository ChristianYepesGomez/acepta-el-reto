import java.util.Scanner;

public class P156_Ascensor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int plantaInicial, pisoDestino, res;

		do {
			res = 0;
			plantaInicial = sc.nextInt();

			if (plantaInicial > -1) {

				do {

					pisoDestino = sc.nextInt();
					if (pisoDestino > -1) {

						res += Math.abs(pisoDestino - plantaInicial);

						plantaInicial = pisoDestino;

					}
				} while (pisoDestino > -1);
				
				System.out.println(res);
			}

		} while (plantaInicial > -1);

	}

}
