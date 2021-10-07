import java.util.Scanner;

public class P462_MundoLimpio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long vecesLimpiadas, horas, minutos, segundos, dias, totalSegundos;

		String cadenaTiempo;

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			vecesLimpiadas = sc.nextInt();
			cadenaTiempo = sc.next();

			horas = Integer.parseInt(cadenaTiempo.substring(0, 2));
			minutos = Integer.parseInt(cadenaTiempo.substring(3, 5));
			segundos = Integer.parseInt(cadenaTiempo.substring(6, 8));

			segundos += horas * 3600;
			segundos += minutos * 60;

			totalSegundos = segundos * vecesLimpiadas;

			dias = totalSegundos / 86400;
			totalSegundos = totalSegundos % 86400;
			horas = totalSegundos / 3600;
			totalSegundos = totalSegundos % 3600;
			minutos = totalSegundos / 60;
			segundos = totalSegundos % 60;

			System.out.printf("%d %02d:%02d:%02d%n", (int) dias, (int) horas, (int) minutos, (int) segundos);
		}

	}

}