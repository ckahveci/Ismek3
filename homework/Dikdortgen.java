//Kullan�c� tarafindan girilen satir ve s�tun sayisi ile *'lardan dikd�rtgen olu�uyor.
package homework;

import java.util.Scanner;

public class Dikdortgen {

	public static void main(String[] args) {
		Scanner klayvedenGirilen = new Scanner(System.in);

		System.out.println("satir sayisi giriniz:");
		int satirSayisi = klayvedenGirilen.nextInt();
		System.out.println("s�tun sayisini giriniz:");
		int sutunSayisi = klayvedenGirilen.nextInt();

		for (int i = 0; i < satirSayisi; i++) {
			if (i == 0 || i == satirSayisi-1) {
				for (int j = 0; j < sutunSayisi; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = 0; j < sutunSayisi; j++) {
					if (j == 0 || j == sutunSayisi - 1)
						System.out.print("*");
					else {
						System.out.print(" ");
					}
				}
			}

			System.out.println();
		}

	}

}
