
package Zadaci_13_08_2018;

import java.util.Scanner;

public class ProstiBrojevi {

	public static boolean prosti( int b) {
		for(int i = 2; i < Math.abs(b); i++){
			if(b % i == 0) { 
        return false;
		}
	}
		return true;
	}
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite prvi argument");
		int a = unos.nextInt();
		System.out.println("Unesite prvi argument");
		int b = unos.nextInt();

		for(int i = a; i <= b; i++){
			if(prosti(i)){
				System.out.print(i+" ");
			}
	}

}
}
