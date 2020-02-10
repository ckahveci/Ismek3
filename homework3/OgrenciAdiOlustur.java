package homework3;

import java.util.Random;
import java.util.Scanner;


	public class OgrenciAdiOlustur {
		  
		static String ogrenciAdi(int harfSayisi) {
			int index=0;
			char[] alfabe = new char[26];
			
			for (char i ='A'; i <='Z'; i++) {
				alfabe[index++]=i;
				}
			String ogrenciAdi="";
			for (int i = 0; i < harfSayisi; i++) {
				Random rastgele = new Random();
				int alfabeIndex = rastgele.nextInt(26);
				char harf=alfabe[alfabeIndex];
				ogrenciAdi+=harf;
				
			//	System.out.println(ogrenciAdi);
				}
			
			return ogrenciAdi;
		   }
	}


