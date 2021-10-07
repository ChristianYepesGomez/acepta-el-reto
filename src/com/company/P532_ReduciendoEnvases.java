import java.util.Scanner;

public class P532_ReduciendoEnvases {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int pesoProducto, pesoEnvase;
		int res = 0;
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			pesoProducto = sc.nextInt();
			pesoEnvase = sc.nextInt();

			res = pesoEnvase - pesoProducto;

			System.out.println(Math.abs(res));

		}

		sc.close();

	}

}