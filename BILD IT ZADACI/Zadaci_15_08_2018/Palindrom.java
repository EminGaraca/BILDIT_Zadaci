package Zadaci_15_08_2018;
import java.util.Scanner;
public class Palindrom {

	public static void main(String[] args) {
		System.out.println("Unesite cijeli broj: ");
		Scanner unos=new Scanner(System.in);
		
		int broj = unos.nextInt();

		if (isPalindrome(broj)) {
			System.out.println("Uneseni broj je palindrom.");
		} else {
			System.out.println("Uneseni broj nije palindrom.");
		}

	}

	public static int reverse(int broj) {

		int reverse = 0;
		while (broj != 0) {

			reverse = reverse * 10;
			reverse += (broj % 10);
			broj /= 10;
		}
		return reverse;
	}

	public static boolean isPalindrome(int broj) {

		if (broj == reverse(broj)) {
			return true;
		}
		return false;

	}

}
