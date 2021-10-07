import java.util.Scanner;

public class P180_Angulos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n,x,a,b,c,y,z;
		
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			x = 0;
			y = Integer.MAX_VALUE;
			z = 0;
			
			if (x < a) x = a;
			if (x < b) x = b;
			if (x < c) x = c;
			if (y > a) y = a;
			if (y > b) y = b;
			if (y > c) y = c;
			
			if (x == a && y == b) z = c;
			if (x == a && y == c) z = b;
			if (x == b && y == a) z = c;
			if (x == b && y == c) z = a;
			if (x == c && y == a) z = b;
			if (x == c && y == b) z = a;

			
			if ((x + y <= z) || (x + z <= y) || (y + z <= x)) {
				System.out.println("IMPOSIBLE");
			}
			
			else {
				
				if ((y * y) + (z * z) == (x * x)) {
					System.out.println("RECTANGULO");
				}
				else if ((y * y) + (z * z) > (x * x)) {
					System.out.println("ACUTANGULO");
				}
				else if ((y * y) + (z * z) < (x * x)) {
					System.out.println("OBTUSANGULO");
				}
			}
		}
		sc.close();
	}

}
