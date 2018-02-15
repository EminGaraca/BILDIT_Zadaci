package Zadaci_14_08_2018;

import java.util.Scanner;

public class ObrnutiRedoslijed {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite 10 cijelih brojeva ! ");
		int[] brojevi = new int[10];
		
        for (int i = 0; i < brojevi.length; i++){
			brojevi[i] = unos.nextInt();
		}
		for (int j = brojevi.length-1; j > -1; j--){
			System.out.print(brojevi[j] + " ");
		}

		
       }
		}
		
		

	


