import java.util.Scanner;

public class P478_Conjuritis {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int veces;
		int A, B;
		long suma;
		A = 0;
		B = 0;
		
		do {
			veces = sc.nextInt();
			suma = 0;
			if (veces != 0) {

				long costeHechizos, valorABuscar, danyoTotalVillano;
				long sumaCosteHechizos = 0;
				long[] vector = new long[veces];

				for (int i = 0; i < veces; i++) {
					costeHechizos = sc.nextLong();
					vector[i] = costeHechizos;
					sumaCosteHechizos += costeHechizos;
				}

				danyoTotalVillano = sc.nextLong();
				valorABuscar = sumaCosteHechizos - danyoTotalVillano;

				while (suma != valorABuscar) {
					A = vector.length - 1;
					B = 0;

					for (int i = 0; i < vector.length; i++) {
						suma = vector[B] + vector[A];
						if (suma != valorABuscar) {

							if (suma > valorABuscar) {
								A--;
							} else {
								B++;
							}
						} else {
							i = vector.length;
						}
					}
				}

				System.out.printf("%d %d%n", vector[B], vector[A]);

			}
		} while (veces != 0);
	}

}
