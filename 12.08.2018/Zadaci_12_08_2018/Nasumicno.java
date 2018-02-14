package Zadaci_12_08_2018;

public class Nasumicno {
public static void main(String[] args) {

		
		
		int[] niz = new int[100];

		
		for (int i = 0; i < 100; i++) {
			int broj = (int) (Math.random() * 10);
			niz[broj]++;
			
		}

		for (int i = 0; i < niz.length; i++) {
			System.out.println(i + " ponavlja " + niz[i] + " puta.");
		}

	}

}
