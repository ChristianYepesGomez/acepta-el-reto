import java.util.Scanner;

public class P155_Perimetro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x,y;
		
		do {
		
				x = sc.nextInt();
				y = sc.nextInt();
				
				if (x >= 0 && y >= 0) {
					
				System.out.println((x+y)*2);
			}
		} while (x >= 0 && y >= 0);
		sc.close();
	}

}
