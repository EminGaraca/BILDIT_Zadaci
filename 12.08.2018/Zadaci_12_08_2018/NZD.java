package Zadaci_12_08_2018;
import java.util.Scanner;
public class NZD {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println(" Unesite dva cijela broja s spaceom izmeðu");
      
		int b1=unos.nextInt();
		int b2=unos.nextInt();
		
		int nzd=1;
		int k=1;
		
		while (k<=b1 & k<=b2 ) {
			if (b1 % k==0 && b2 % k==0 ) {
				nzd=k;
					
			}
			k++;
		}
		
		System.out.println(" NZD je " +nzd);
	}
	

}
