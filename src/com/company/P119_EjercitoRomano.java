import java.util.Scanner;

public class P119_EjercitoRomano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int soldados = 0;
		int formacion, soldadosAux;
		long res;
		do {
			soldados = sc.nextInt();
			res = 0;
			soldadosAux = soldados;
			if (soldadosAux > 0) {

				while (soldadosAux > 3) {
					formacion = (int) Math.sqrt(soldadosAux);
					soldadosAux -= formacion * formacion;
					res += (((formacion - 2) * 4) * 2) + 12;// Exterior esquinas + esquinas
					res += (formacion - 2) * (formacion - 2);// Interior
					if (soldadosAux == 1) {// Cuando quede 1 soldado
						res += 5;
					}

				}
				if (soldados < 4) {
					res += soldados * 5;
				}

				System.out.println(res);

			}

		} while (soldados > 0);

		sc.close();
	}

}
