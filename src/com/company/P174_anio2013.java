import java.util.Scanner;

public class P174_anio2013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int year;
		String yearString,auxX,auxY;
		int casos    = sc.nextInt();
		int contadorSinRepetir,contadorRepetidos,contador,resInt;
		boolean b    = true;
		boolean auxB = true;
		String resYear;
		
		//Plantearlo para N numero de casos
		for (int i = 0; i < casos; i++) {
			resYear = "";
			contador = 1;
			contadorSinRepetir = 1;
			contadorRepetidos = 1;
			b = true;
			auxB = true;
			
			year = sc.nextInt();
			
			yearString = Integer.toString(year); 
			
			//Recorrer el año en String, uno a uno
			for (int j = 0; j < yearString.length()-1 ; j++) {
				
				auxX = yearString.substring(j,j+1);
				
				for (int j2 = contador; j2 < yearString.length() ; j2++) {
					auxY = yearString.substring(j2,j2+1);
					if (auxX.equals(auxY)) {
						b = false;
						j2 = yearString.length();
						j = yearString.length();
					}
				}
				contador++;
			}
			
			//Si no se repiten numeros
			if ( b == true ) {
				
				while (auxB == true && contadorSinRepetir == 1) {
					
					year--;
					yearString = Integer.toString(year);
					
					if (contador >= yearString.length()) {
						contador = 1;
					}
					
					for (int j = 0; j < yearString.length()-1 ; j++) {
						
						auxX = yearString.substring(j,j+1);
						
						for (int j2 = contador; j2 < yearString.length() ; j2++) {
							auxY = yearString.substring(j2,j2+1);
							if (auxX.equals(auxY)) {
								auxB = false;
								year++;
								j2 = yearString.length();
								j = yearString.length();
								resYear += year;
							}
						}//For
						contador++;
						
					}//For
					
				}//while
				
				while (auxB == false) {
					
					year++;
					contadorSinRepetir++;
					yearString = Integer.toString(year);
					
					if (contador >= yearString.length()) {
						contador = 1;
					}
					
					for (int j = 0; j < yearString.length()-1 ; j++) {
						
						auxX = yearString.substring(j,j+1);
						
						for (int j2 = contador; j2 < yearString.length() ; j2++) {
							auxY = yearString.substring(j2,j2+1);
							if (auxX.equals(auxY)) {
								auxB = true;
								contadorSinRepetir--;
								j2 = yearString.length();
								j = yearString.length();
							}
						}//For
						contador++;
						
					}//For
					
				}//While
				resInt = Integer.parseInt(resYear);
				System.out.println(resInt + " " + contadorSinRepetir);
			}
			
			//Si se repiten numeros
			if (b == false ) {
				contador = 1;
				while (auxB == true && contadorRepetidos == 1) {
					auxB = false;
					year--;
					yearString = Integer.toString(year);
					
					if (contador >= yearString.length()) {
						contador = 1;
					}
					
					for (int j = 0; j < yearString.length()-1 ; j++) {
						
						auxX = yearString.substring(j,j+1);
						
						for (int j2 = contador; j2 < yearString.length() ; j2++) {
							auxY = yearString.substring(j2,j2+1);
							if (auxX.equals(auxY)) {
								auxB = true;
								j2 = yearString.length();
								j = yearString.length();
								contador = 0;
							}
							
						}//For
						contador++;
						
					}//For
					
				} //While
				year++;
				resInt = year;
				
				while (auxB == false) {
					auxB = true;
					year++;
					contadorRepetidos++;
					yearString = Integer.toString(year);
					
					if (contador >= yearString.length()) {
						contador = 1;
					}
					
					for (int j = 0; j < yearString.length()-1 ; j++) {
						
						auxX = yearString.substring(j,j+1);
						
						for (int j2 = contador; j2 < yearString.length() ; j2++) {
							auxY = yearString.substring(j2,j2+1);
							if (auxX.equals(auxY)) {
								auxB = false;
								j2 = yearString.length();
								j = yearString.length();
								contador = 0;
							}
						}//For
						contador++;
						
					}//For
					
				}//While
				contadorRepetidos--;
				System.out.println(resInt + " " + contadorRepetidos);
			}
		}
		
	}

}
