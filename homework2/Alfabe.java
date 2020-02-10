/* kullanicidan kelime sayisinin ve kelime(lerin) kac harften olusacagi bilgisi alinarak rrastgele harflerden
   olusan kelimeler elde eden programdir.*/
package homework2;

import java.util.Random;
import java.util.Scanner;

public class Alfabe {

	public static void main(String[] args) {
		
		char[] alfabe = new char[52];
		int index = 0;
		
		for (char i = 'A'; i <= 'z'; i++) {

			if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i <= 'z')) {
				alfabe[index++] = i;

			} else {
				System.out.print("");
			}

		}
		for (int j = 0; j < alfabe.length; j++) {
			System.out.print(alfabe[j] + ",");

		}

		Scanner klavyedenGirilen = new Scanner(System.in);
		System.out.println("\n Kelime sayisi=");
		int kelimeSayisi = klavyedenGirilen.nextInt();
		System.out.println("Bir kelimedeki harf sayisi=");
		int harfSayisi = klavyedenGirilen.nextInt();
		String[] kelimeler = new String[kelimeSayisi];

		for (int i = 0; i < kelimeSayisi; i++) {
			String kelime="";
			for (int j = 0; j < harfSayisi; j++) {
				Random rastgele = new Random();
				int alfabeindex = rastgele.nextInt(alfabe.length);

				System.out.print(alfabe[alfabeindex]);
				char harf=alfabe[alfabeindex];
				kelime+=harf;
				
			}

			System.out.println("");
			kelimeler[i]=kelime;

		}

		for (int i = 0; i < kelimeler.length; i++) {
			System.out.println(kelimeler[i]);

		}

	}

}
