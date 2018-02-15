package Zadaci_14_08_2018;
import java.util.Scanner;
public class BrojSlovaStringa {

	
	public static int countLetters(String s) {
		
		return s.length();
	}
	
	
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite neki string !");
		String nesto=unos.nextLine();
		
		System.out.println("Broj slova je : "+countLetters(nesto));
		

	}

}
