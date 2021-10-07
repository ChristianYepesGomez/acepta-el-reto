import java.util.Scanner;

public class P363_LasCalorias {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double entrenamientos = 0;
		while (sc.hasNextInt()) {
			
			int caloriasIngeridas = 0;
			int caloriasQuemadas = sc.nextInt();
			if (caloriasQuemadas <= 0) break;
			int comidas = sc.nextInt();
			
				
			
				for (int i = 0; i < comidas; i++) {
				
					caloriasIngeridas += sc.nextInt();
					
				}
				
				entrenamientos = (double)caloriasIngeridas / (double)caloriasQuemadas;
				
				if (entrenamientos % 1 != 0) {
					entrenamientos++;
				}
				
				System.out.println((int)entrenamientos);
			
		}
		
	}

}
