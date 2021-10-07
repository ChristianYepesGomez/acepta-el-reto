import java.util.Scanner;

public class P369_Base1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b = true;
		int n;
		
		while ( b == true ) {
			
			n   = sc.nextInt();
			
			if (n != 0) {
				
				for (int i = 0; i < n; i++) {
					System.out.printf("1");
				}
				System.out.println();
			}
			else b =  false;
		}
		
		sc.close();
	}

}
