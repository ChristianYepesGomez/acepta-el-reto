import java.util.Arrays;
import java.util.Scanner;

public class P534_TrasElFestival {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cubos, pesoCubo, diferenciaMaxima, diferenciaAux;
		int[] vectorPesoCubos;

		do {

			cubos = sc.nextInt();

			if (cubos > 0) {

				vectorPesoCubos = new int[cubos];
				diferenciaMaxima = 0;
				diferenciaAux = 0;

				for (int i = 0; i < cubos; i++) {
					pesoCubo = sc.nextInt();
					vectorPesoCubos[i] = pesoCubo;
				}

				Arrays.sort(vectorPesoCubos);

				for (int i = 0; i < vectorPesoCubos.length; i = i + 2) {

					diferenciaAux = vectorPesoCubos[i + 1] - vectorPesoCubos[i];

					if (diferenciaAux > diferenciaMaxima) {
						diferenciaMaxima = diferenciaAux;
					}
				}

				System.out.println(diferenciaMaxima);

			}
		} while (cubos > 0);

		sc.close();
	}

}