import java.util.Scanner;

public class P164_AreaRectangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		 int bIzq, bDer, aIzq, aDer;
	        int base, altura;

	        while (true) {

	            bIzq = sc.nextInt();
	            aIzq = sc.nextInt();
	            bDer = sc.nextInt();
	            aDer = sc.nextInt();

	            base   = bDer - bIzq;
	            altura = aDer - aIzq;

	            if (base < 0 || altura < 0) break;
	            System.out.println( base * altura );
	        }

		sc.close();
	}

}
