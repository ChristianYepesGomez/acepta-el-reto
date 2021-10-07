import java.util.Scanner;

public class P413_ClarasOscuras {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int ancho,alto,res,claras,oscuras;
		
		for (int i = 0; i < n; i++) {
			ancho = sc.nextInt();
			alto  = sc.nextInt();
			
			res = ancho * alto;
			
			if ( res % 2 != 0) {
				claras = res / 2 + 1;
				oscuras = res / 2;
			}
			else {
				claras = res / 2;
				oscuras = res / 2;
			}
			System.out.printf("%d %d%n",claras,oscuras);
		}
		sc.close();
	}

}
