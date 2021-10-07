import java.util.Scanner;

public class P370_La13_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int casos = sc.nextInt();

		String llave,num1String,num2String;
		int num1, num2,contador;

		for (int i = 0; i < casos; i++) {
			contador = 0;
			num1String = "";
			num2String = "";
			llave = sc.next();

			for (int j = 0; j < llave.length(); j++) {
				
				if (llave.substring(j,j+1).equals("-")) {
					num1String = llave.substring(0,j);
					num2String = llave.substring(j+1,llave.length());
					j = llave.length();
				}
				
			}
			
			num1 = Integer.parseInt(num1String);
			num2 = Integer.parseInt(num2String);
			
			if (num1 - 1 == num2 || num1 + 1 == num2) {

				if (num1 > num2 && num2 % 2 == 0) {
					System.out.println("SI");
				} else if (num1 < num2 && num1 % 2 == 0) {
					System.out.println("SI");
				} else {
					System.out.println("NO");
				}

			} else {
				System.out.println("NO");
			}

		}

		sc.close();

	}

}
