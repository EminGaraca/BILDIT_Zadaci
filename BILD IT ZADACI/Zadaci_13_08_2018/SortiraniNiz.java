package Zadaci_13_08_2018;
import java.util.Scanner;
public class SortiraniNiz {
	public static double[ ][ ] sortRows (double[ ][ ] array){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				double trenutniNajmanji = array[i][j];
				double trenutniNajmanjiIndeks = i;
				for (int k = j + 1; k < array[i].length; k++) {
					if (array[i][k] < array[i][j]) {
						double privremena = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = privremena;
					}
				}
			}
		}
		return array;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double niz[][] = new double[3][3];
		System.out.println("Unesite 3x3 matricu: ");
		
		for (int red = 0; red < niz.length; red++) {
			for (int kolona = 0; kolona < niz[red].length; kolona++) {
				niz[red][kolona] = unos.nextInt();
				System.out.print(niz[red][kolona] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Sortirani niz: ");
		sortRows(niz);
		for(int i = 0; i < niz.length; i++) {
			for(int k = 0; k < niz[0].length; k++) {
				System.out.print(niz[i][k] + " ");
			}
			System.out.println();
	}
		unos.close();
	}
}

	