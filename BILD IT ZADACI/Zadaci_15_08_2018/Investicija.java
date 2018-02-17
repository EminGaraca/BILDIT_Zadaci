package Zadaci_15_08_2018;
import java.util.Scanner;
public class Investicija {

	public static void main(String[] args) {
	Scanner unos=new Scanner(System.in);
	System.out.println("Unesite iznos investicije ?");
	double iznosInvesticije=unos.nextDouble();
	System.out.println("Unesite godišnju interesnu stopu ?");
	double godisnjaInteresnaStopa=unos.nextDouble();
	System.out.println("Unesite broj godina ?");
	int brojGodina=unos.nextInt();
	double mjesecnaInteresnaStopa=godisnjaInteresnaStopa/1200;
	
	double buducaVrijednostInvesticije=iznosInvesticije*Math.pow((1+mjesecnaInteresnaStopa), (brojGodina*12));
	System.out.println("Buduæa vrijednost investicije je  :  "+buducaVrijednostInvesticije);
	}

}
