import java.util.Scanner;

public class P140_SumaDigitos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean b = true;
		int n1, nAux, res1;
		String s1, res2;

		do {

			n1 = sc.nextInt();

			if (n1 > -1) {
				res1 = 0;
				res2 = "";

				s1 = Integer.toString(n1);

				for (int i = 0; i < s1.length(); i++) {
					res1 += Integer.parseInt(s1.substring(i,i+1));
					if (i != s1.length() - 1) {
						res2 += s1.substring(i, i + 1) + " + ";
					} else {
						res2 += s1.substring(i, i + 1) + " = ";
					}
				}

				System.out.println(res2 + res1);
			} else {

				b = false;
			}

		} while (b == true && sc.hasNextInt());
		sc.close();
	}

}
