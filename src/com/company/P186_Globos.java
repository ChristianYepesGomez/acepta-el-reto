import java.util.Scanner;

public class P186_Globos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int res, resAux;
		int pos = 0;
		boolean aux = false;

		while (b == true) {
			res = -1;
			resAux = -1;
			int numEquipos = sc.nextInt();
			int globos = sc.nextInt();

			if (globos == 0 && numEquipos == 0) {
				b = false;
			} else {

				int[] vector = new int[numEquipos];

				for (int i = 0; i < globos; i++) {

					int numEquipo = sc.nextInt();
					sc.nextLine();

					vector[numEquipo - 1]++;
				}


				for (int i = 0; i <vector.length; i++) {

					res = vector[i];

					if (res > resAux) {
						resAux = res;
						pos = i;
						aux = false;
					} else if (res == resAux) {
						aux = true;
					}

				}

				if (aux == true) {
					System.out.println("EMPATE");
				} else {
					System.out.println(pos + 1);
				}
			}

		}
		sc.close();
	}

}
