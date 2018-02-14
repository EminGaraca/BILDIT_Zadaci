package Zadaci_12_08_2018;
import java.util.Scanner;
public class SamogasniciSugalsnici {
	
public static String suglasnici(String string) {
		int brojSamoglasnika=0;
		int brojSuglasnika=0;
		
	for (int i =0 ; i<string.length() ; i++ ) {
	
		if (string.charAt(i)=='e' || string.charAt(i)=='a' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u') {
			brojSamoglasnika++;
		}
		else if (string.charAt(i) >= 97 && string.charAt(i) <= 122) {
			brojSuglasnika++;
		}
		else {
			System.out.println("Pogresan unos");
		}
		}
	System.out.println("Broj samoglasnika je : "+brojSamoglasnika);
	System.out.println("Broj sugasnika je : "+brojSuglasnika);
	
	return string;
}
	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
        System.out.println("Unesite rijeè !");
        String s=unos.nextLine();
      
        suglasnici(s);
	}
}
