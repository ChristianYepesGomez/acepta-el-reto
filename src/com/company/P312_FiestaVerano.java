import java.util.Scanner;

public class P312_FiestaVerano {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long num1, num2, mcd, res, suma;

		do {
			num1 = sc.nextLong();
			if (num1 != 0) {

				suma = num1;
				mcd = num1;

				do {
					num2 = sc.nextLong();
					suma += num2;
					mcd = MCD_Euclides(mcd, num2);
				} while (num2 != 0);

				res = suma / mcd;
				System.out.println(res);
			}
		} while (num1 != 0);

	}

	public static long MCD_Euclides(long a, long b) {
		long t;

		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

}
