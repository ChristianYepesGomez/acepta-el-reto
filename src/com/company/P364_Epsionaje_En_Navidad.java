import java.util.Scanner;

public class P364_Epsionaje_En_Navidad {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String frase, fraseEncriptada;
		int ascii;

		do {
			fraseEncriptada = "";
			frase = sc.nextLine();

			if (!frase.equals("FIN")) {

				for (int i = 0; i < frase.length(); i++) {

					ascii = (int) frase.charAt(i) + 1;
					fraseEncriptada += (char) ascii;
				}

				fraseEncriptada = fraseEncriptada.replace("!", " ");
				fraseEncriptada = fraseEncriptada.replace("[", "A");

				System.out.println(fraseEncriptada);
			}
		} while (!frase.equals("FIN"));

		sc.close();
	}

}
