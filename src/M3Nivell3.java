import java.util.*;

public class M3Nivell3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
	
		 int n = 0;
		 int fb = 0;
		 int acum1 = 1;
		 int acum2;
		 
		 do {
			 System.out.print("Introdueix un nombre N major o igual a 1: ");  //La sèrie de Fibonacci només té sentit per a N > 1
			 n = sc.nextInt();
			 
		 } while (n<=1);
		 
		for (int i =1; i<=n ;i++) {
			acum2 = fb;
			fb= acum1 + fb;
			acum1 = acum2;
			
			 System.out.print(acum1 +" ");
		}
				
	}
}
