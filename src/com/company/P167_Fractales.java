import java.util.Scanner;

public class P167_Fractales {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long longitud, total;

		while (sc.hasNextInt()) {

			total = 0;
			longitud = sc.nextLong();

			total = calcularTotal(longitud);

			System.out.println(total);

		}

	}

	public static long calcularTotal(long longitud) {

		int total = 0;

		if (longitud > 0) {

			total += longitud * 4 + 4 * (calcularTotal(longitud / 2));

		}

		return total;
	}
}
