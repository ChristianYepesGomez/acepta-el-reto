import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P254_Esquiando {

	public static void main(String[] args) {
		//TODO Revisar con quick sort
		Scanner sc = new Scanner(System.in);

		int esquiadores = 0;
		int altura,longitud;
		int sol = 0;
		int y = 0;
		boolean condicion = false;
		
		
		while (sc.hasNextInt() && condicion == false) {
			
			y = 0;
			sol = 0;
			
			esquiadores = sc.nextInt();
			
			if (esquiadores != 0) {
			
			ArrayList<Integer> alturas = new ArrayList<Integer>();
			ArrayList<Integer> esquis = new ArrayList<Integer>();
			
			altura = 0;
			longitud = 0;
			
			for (int i = 0; i < esquiadores ; i++) {
				altura = sc.nextInt();
				alturas.add(altura);
			}
				
			for (int i = 0; i < esquiadores ; i++) {
				longitud = sc.nextInt();
				esquis.add(longitud);
			}
			Collections.sort(alturas);
			Collections.sort(esquis);
			
			for (int i = 0; i < alturas.size(); i++) {
				sol = alturas.get(i) - esquis.get(i);
				y += sol;
			}
			
			if (y < 0 ) {
				y = y * -1;
			}
			
			System.out.println(y);
			
			}
			
			else condicion = true;
			
		}
		
		sc.close();
	}

}
