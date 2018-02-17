package Zadaci_15_08_2018;
import java.util.Scanner;
public class Avion {

	public static void main(String[] args) {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite brzinu u m/s ?");
		double brzina=unos.nextDouble();
		System.out.println("Unesite ubrzanje u m/s2 ?");
		double ubrzanje=unos.nextDouble();
		
		double minimalnaDuzinaPiste=(brzina*brzina)/(2*ubrzanje);
		System.out.println("Minimalna dužina piste je : "+minimalnaDuzinaPiste);
		
		
	}

}
