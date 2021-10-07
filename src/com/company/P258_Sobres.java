import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P258_Sobres {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int sobres, comensales, valor;

		Queue<Integer> cola = new LinkedList<Integer>();

		do {

			String res = "";

			sobres = sc.nextInt();
			comensales = sc.nextInt();

			if (sobres > 0) {

				for (int i = 0; i < comensales; i++) {
					valor = sc.nextInt();
					cola.add(valor);
				}

				res += valorMayorCola(cola);

				for (int i = 0; i < sobres - comensales; i++) {
					cola.poll();
					valor = sc.nextInt();
					cola.add(valor);
					res += " " + valorMayorCola(cola);
				}
			}

			System.out.println(res);
			cola.clear();
		} while (sobres > 0);

	}

	public static int valorMayorCola(Queue<Integer> cola) {

		return (int) Collections.max(cola);

	}

}
