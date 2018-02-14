package Zadaci_13_08_2018;
import java.util.Scanner;
public class StriktnoIdenticniNizovi {

	
	public static boolean striktnoIdenticniNizovi(int[] niz1, int[] niz2) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite dužinu nizova ?");
		int duzina=unos.nextInt();
		
		System.out.println("Unesite prvi niz ?");
		niz1=new int[duzina];
		for (int i=0 ; i<duzina ; i++ ) {
			niz1[i]=unos.nextInt();
		}
		
		System.out.println("Unesite drugi niz ?");
		niz2=new int[duzina];
		for (int i=0 ; i<duzina ; i++ ) {
			niz2[i]=unos.nextInt();
		} 
		
		 for (int i=0 ; i<niz1.length ; i++) {	 
	
				 if (niz1[i]!=niz2[i]) {
					return false;
				 }
				 else {
					return true;
				 }
				 
			 }
		 unos.close();
		return false;
	     
	}
	public static void main(String[] args) {
	      
		int[] niz1 = null;
		int[] niz2 = null;
		if (striktnoIdenticniNizovi(niz1,niz2)) {
			System.out.println("Jesu identièni !");
		}
		else {
			System.out.println("Nisu identièni !");
		}
	}

}
