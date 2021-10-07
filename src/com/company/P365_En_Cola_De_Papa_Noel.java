import java.util.Scanner;

public class P365_En_Cola_De_Papa_Noel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numVeces = sc.nextInt();

		int ninos, numRegalos, minutos;
		int posAitor = 0;

		for (int i = 0; i < numVeces; i++) {
			minutos = 0;
			ninos = sc.nextInt();
			posAitor = sc.nextInt();

			int[] vectorNinos = new int[ninos];

			for (int j = 0; j < vectorNinos.length; j++) {
				numRegalos = sc.nextInt();
				vectorNinos[j] = numRegalos;
			}

			while (vectorNinos[posAitor - 1] != 0) {
				for (int j = 0; j < vectorNinos.length; j++) {

					if (vectorNinos[j] > 0) {
						vectorNinos[j]--;
						minutos = minutos + 2;
					}
					if (vectorNinos[posAitor - 1] == 0) {
						j = vectorNinos.length;
					}

				}
			}

			System.out.println(minutos);
		}
	}

}
