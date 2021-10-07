import java.util.Scanner;

public class P533_BotellaGanadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();
		int objetivo, numBotellas,reciclajeTotal,ganador,contador;

		for (int i = 0; i < casos; i++) {

			contador = 0;
			objetivo = sc.nextInt() * 1000;
			reciclajeTotal = 0;
			ganador = 0;
			
			do {
				contador++;
				numBotellas = sc.nextInt();
				
				reciclajeTotal += numBotellas * 125;
				
				if (reciclajeTotal >= objetivo && ganador == 0) {
					ganador = contador;
				}
				
			} while(numBotellas > 0);
			
			if (ganador != 0) {
				System.out.println(ganador);
			} else {
				System.out.println("SIGAMOS RECICLANDO");
			}
			
		}
		sc.close();
	}

}