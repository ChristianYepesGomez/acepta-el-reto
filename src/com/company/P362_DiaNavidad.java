import java.util.Scanner;

public class P362_DiaNavidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int dia,mes;
		
		for (int i = 0; i < n; i++) {
			
			dia = sc.nextInt();
			mes = sc.nextInt();
			
			if (dia == 25 && mes == 12) {
				System.out.println("SI");
			}
			else {
				System.out.println("NO");
			}
			
		}
		sc.close();
	}

}
