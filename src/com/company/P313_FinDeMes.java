import java.util.Scanner;

public class P313_FinDeMes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ingresos,gastos,total;
		
		for (int i = 0; i < n ; i++) {
			
			ingresos = sc.nextInt();
			gastos = sc.nextInt();
			total = ingresos + gastos;
			
			if (total >= 0) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}
