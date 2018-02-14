package Zadaci_13_08_2018;

import java.util.Scanner;

public class NajmanjiodDeset {

	public static double min(double[] array) {

		double min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}
		}
		return min;

	}

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double niz[] = new double[10];
		System.out.println("Unesite deset elementa u niz: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = unos.nextInt();
		}
		System.out.println("Najmanji element u nizu je: " + min(niz));
		unos.close();

	}
}