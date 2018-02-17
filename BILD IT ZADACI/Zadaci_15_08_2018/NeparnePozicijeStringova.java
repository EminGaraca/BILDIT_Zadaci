package Zadaci_15_08_2018;
import java.util.Scanner;
public class NeparnePozicijeStringova {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite neki string !");
		String s = unos.nextLine();
		
		
		for (int i=0 ; i<s.length() ; i++) {
			if (i%2!=0) {
				System.out.print(s.charAt(i-1));
			}
				
		}
		

	}

}
