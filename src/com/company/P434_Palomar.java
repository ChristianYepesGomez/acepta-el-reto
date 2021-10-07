import java.util.Scanner;

public class P434_Palomar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int ejemplares,cajas;
		int n = sc.nextInt();
		
		String res = " ";
		for (int i = 0; i < n; i++) {
			ejemplares = sc.nextInt();
			cajas 	   = sc.nextInt();
			
			if (ejemplares > cajas) {
				res = "PRINCIPIO";
			}
			else {
				if (ejemplares >= 2){
					res = "ROMANCE";
				}
			}
				

			System.out.println(res);
		}
		
	}

}
