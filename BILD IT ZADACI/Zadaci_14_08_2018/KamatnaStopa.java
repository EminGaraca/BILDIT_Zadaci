package Zadaci_14_08_2018;
import java.util.Scanner;

public class KamatnaStopa {

	public static void main(String[] args) {
	Scanner unos = new Scanner(System.in);
	System.out.println("Unesite mjeseèni iznos štednje: ");
	double štednja = unos.nextDouble();
	System.out.println("Unesite broj mjeseca nakon kojeg bi željeli znati stanje raèuna: ");
	int mjeseci = unos.nextInt();
		
	double suma = 0;
	
	for ( int i = 0; i < mjeseci; i++ ) {
		suma = ( suma + štednja ) * 1.00417;
		
	}

	System.out.printf("Vaše stanje raèuna nakon " + mjeseci + " mjeseca/i je: %.3f ", suma);
	}

}