package Zadaci_12_08_2018;

import java.util.ArrayList;
public class ArrayLista {
	
	public  static  int  ArrayList ( ArrayList <Integer> lista ) {
		int max=0;
		if (lista.isEmpty()) {
			System.out.println("Prazan skup !");
			
		} else {
			
			for ( int i : lista) {
				System.out.println(i);
				if ( i>max ) {
					max=i;
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
	
		ArrayList <Integer> Niz = new ArrayList<>();
		Niz.add(8);
		Niz.add(10);
		Niz.add(3);
		Niz.add(4);
		System.out.println("Najveci u nizu je : "+ArrayList(Niz));
		
	}

}
