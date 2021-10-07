import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class P312_MesasPLaya {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> personas = new ArrayList<Integer>();
		
		int n = 0;
		int sol = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		while (sc.hasNextInt()) {
			
			n = sc.nextInt();
			personas.add(n);
			
			if ( n > 0) {
				
				while ( x != 0 ) {
			
					x = sc.nextInt();
					
					if (x != 0) {
						
					personas.add(x);
					
					}
				}
				
					if (x == 0) {
						
						Collections.sort(personas);
					}
					
					for (int i = personas.get(0); i > 0; i--) {
						
						sol = personas.get(0) % i;
						y++;
						
						if ( sol == 0) {
							for (int j = 1; j < personas.size() ; j++) {
								z = j % i;
								if ( z != 0 ) {
									break;
								}
							}
							
						}
						
						System.out.println(sol);

					}
			}
		}
		
		
		sc.close();
	}

}
