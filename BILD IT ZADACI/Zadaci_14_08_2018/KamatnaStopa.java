package Zadaci_14_08_2018;
import java.util.Scanner;

public class KamatnaStopa {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
	System.out.println("Unesite mjese�ni iznos �tednje: ");
	double �tednja = unos.nextDouble();
	System.out.println("Unesite broj mjeseca nakon kojeg bi �eljeli znati stanje ra�una: ");
	int mjeseci = unos.nextInt();
		
	double suma = 0;
	
	for ( int i = 0; i < mjeseci; i++ ) {
		suma = ( suma + �tednja ) * 1.00417;
		
	}

	System.out.printf("Va�e stanje ra�una nakon " + mjeseci + " mjeseca/i je: %.3f ", suma);
	}

}