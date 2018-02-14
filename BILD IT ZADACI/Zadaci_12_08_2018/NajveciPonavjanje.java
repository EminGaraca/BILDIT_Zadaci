package Zadaci_12_08_2018;
import java.util.Scanner;
public class NajveciPonavjanje {
	
	public static int Najveci( int [] niz) {
		int broj = 0;
		int max=0;
		int maxPonavljanje=0;

		for (int i=0 ; i< niz.length ; i++) {
			if (niz[i]>max) {
				max=niz[i];
				maxPonavljanje++;
			}
		}
		System.out.println("Najveci je: "+max+", a broj ponavljanja najveceg je: "+maxPonavljanje++);
		return maxPonavljanje;
	}
	public static void main(String[] args) {
		int niz []=new int [4];
		niz[0]=17;
		niz[1]=16;
		niz[2]=18;
		niz[3]=18;
		Najveci (niz);

	}

}
