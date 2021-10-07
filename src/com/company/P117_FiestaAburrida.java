import java.util.Scanner;

public class P117_FiestaAburrida {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String nombre = "";
		
		for (int i = 0; i < n; i++) {

			sc.next();
			nombre = sc.next();
			System.out.println("Hola, " + nombre + ".");
			
		}

		sc.close();
		
	}

}
