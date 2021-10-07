import java.util.Scanner;

public class P427_LukeYoSoy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();
		String s1,s2,res;
		
		
		for (int i = 0; i < n; i++) {
			
			s1 = sc.nextLine();
			s2 = sc.nextLine();
			
			if ( s1.equals("Luke") && s2.equals("padre")) {
				res = "TOP SECRET";
			}
			else {
				res = s1 + ", yo soy tu " + s2;
			}
			System.out.println(res);
		}
		
		
	}

}
