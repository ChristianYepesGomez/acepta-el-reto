import java.util.Scanner;

public class P411_Elefantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		boolean auxA = false;
		boolean n = false;
		int pesoMax = 0;
		int pesoElefantes = 0;
		int pesoElefantesAux = 0;
		int i = 0;
		while (sc.hasNextInt() && n == false) {
			
			auxA = false;
			pesoMax = sc.nextInt();
			if (pesoMax == 0) n = true;

				while (sc.hasNextInt() && auxA == false) {
					pesoElefantes = sc.nextInt();
					pesoElefantesAux += pesoElefantes;
					i++;
					if (pesoElefantes == 0 || pesoElefantesAux > pesoMax) auxA = true;
				}
				
			System.out.println(i-1);
		}	
	}

}
