import java.util.Scanner;

public class P381_AlineacionPlanetaria {

	public static void main(String[] args) {

		//TODO
		
		Scanner sc = new Scanner(System.in);
		
		int numPlanetas;

		do {
			
			numPlanetas = sc.nextInt();
			
		} while (numPlanetas != 0);
		
		
		
	}

	public static int MCD(int A, int B) {
		int Dividendo;
		int Divisor;
		int Resto;

		{
			if (A > B) {
				Dividendo = A;
				Divisor = B;
			} else {
				Dividendo = B;
				Divisor = A;
			}
			Resto = Dividendo % Divisor;
			do {
				Dividendo = Divisor;
				Divisor = Resto;
				Resto = Dividendo % Divisor;
			} while (Resto != 0);

		}
		return Divisor;

	}

}
