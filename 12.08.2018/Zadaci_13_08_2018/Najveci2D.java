package Zadaci_13_08_2018;

import java.util.Scanner;

public class Najveci2D {

	public static double locateLargest(double[][] a) {

		double max = a[0][0];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > max) {
					max = a[i][j];

				}
			}

		}
		return max;
	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double niz[][] = new double[2][2];
		System.out.println("Unesite deset elementa u niz: ");
		for (int red = 0; red < niz.length; red++) {
			for (int kolona = 0; kolona < niz[red].length; kolona++) {
				niz[red][kolona] = unos.nextInt();
				System.out.print(niz[red][kolona] + " ");
			}
			System.out.println();
		}

		System.out.println("Najveci element u nizu je: " + locateLargest(niz));
		unos.close();

	}

}
