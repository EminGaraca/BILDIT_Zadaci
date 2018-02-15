package Zadaci_14_08_2018;
public class SpilKarata {

	public static void main(String[] args) {
		
		String[] Niz1 = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] Niz2 = {"kocke", "srca", "djeteline", "pika"};
		
		int broj1 = (int) (Math.random() * 13 ) + 0;
		int broj2 = (int) (Math.random() * 4) + 0;
		
		System.out.print("Karta koju ste izvukli je " + Niz1[broj1] + " u znaku " + Niz2[broj2] + "." );

	}

}
