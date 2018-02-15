package Zadaci_14_08_2018;
import java.util.Scanner;
public class ZajednickiPrefiks {

	public static String Prefiks(String s1,String s2) {
		String ZajP=" ";
		int i ;
		int j ;
		String suma = null;
		
		for ( i=0 ; i<=s1.length()-1;i++) {
		
			if (s1.charAt(i)==s2.charAt(i) ) {
		
			suma=ZajP+=s2.charAt(i);
			
		}
			else {
			break;
				
		}
		}
		System.out.println("Zajednicki prefiks je: "+suma);
		return suma;
	}
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite dva stringa");
		String s1=unos.nextLine();
		String s2=unos.nextLine();

		Prefiks(s1, s2);
	}

}
