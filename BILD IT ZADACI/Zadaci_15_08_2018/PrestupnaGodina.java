package Zadaci_15_08_2018;
import java.util.Scanner;
public class PrestupnaGodina {

	public static void main(String[] args) {
	Scanner unos=new Scanner(System.in);
	
	System.out.println("Unesite poèetnu godinu !");
	int pocetnaGodina=unos.nextInt();
	System.out.println("Unesite krajnju godinu !");
	int krajnjaGodina=unos.nextInt();
	
	int poLiniji=0;
	
	for(int godina=pocetnaGodina ; godina<krajnjaGodina ; godina++ ) {
	
	if ((godina%4==0 && godina%100!=0) || (godina%400==0)) {
		if (poLiniji%10==0)
		System.out.printf("\n");
		System.out.print(godina+" " );
		poLiniji++;
	}
	else {
		System.out.print("");
	}
	}
	
	}

}
