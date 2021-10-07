import java.util.Scanner;

public class P338_Detectando_Copiones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int examenesACorregir, examenesARecordar, copiadosTotales, pillados, resExamen;
		int[] vectorResAlumnos;

		while (sc.hasNext()) {

			copiadosTotales = 0;
			pillados = 0;
			examenesACorregir = sc.nextInt();
			examenesARecordar = sc.nextInt();
			vectorResAlumnos = new int[100001];

			for (int i = 1; i <= examenesACorregir; i++) {
				resExamen = sc.nextInt();

				if (vectorResAlumnos[resExamen] != 0) {

					copiadosTotales++;
					
					if (i - vectorResAlumnos[resExamen] <= examenesARecordar) {
						pillados++;
					}

				}

				vectorResAlumnos[resExamen] = i;

			}

			System.out.printf("%d %d%n", copiadosTotales, pillados);

		}
		sc.close();
	}

}
