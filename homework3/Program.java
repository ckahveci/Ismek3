/*  OgrenciClass tan yeniOgrenci nesnesi üretildi ve bu nesne ile OgrenciAdiOlustur sýnýfýndaki metodla 
 * kullanicinin belirledigi sayida rastgele ogrenci isimleri kullanicinin belirledigi harf sayisi ile olusturuldu.
 */

package homework3;

import java.util.Scanner;

import homework3.OgrenciClass;

public class Program {

	public static void main(String[] args) {
		
		Scanner KlavyedenGirilen = new Scanner(System.in);
		
		OgrenciClass yeniOgrenci=new OgrenciClass();
		System.out.println("Ogrencinin adi kac harfli olacak?\n");
		int harfSayisi = KlavyedenGirilen.nextInt();
		String[] ogrenciÝsimleri=new String[11];
		System.out.println("Kac tane ogrenci adi olusturulsun?");
		int sayi=KlavyedenGirilen.nextInt();
		for(int i=0;i<=sayi;i++) {
			ogrenciÝsimleri[i]=yeniOgrenci.adi;
			yeniOgrenci.adi=OgrenciAdiOlustur.ogrenciAdi(harfSayisi);
			
		}
		for (int i = 1; i <=sayi; i++) {
			
			YazdirmaMetodlari_MenuUtils.AyracYazdir();
			YazdirmaMetodlari_MenuUtils.ProgramBasligiParamatreli(ogrenciÝsimleri[i]);		
			YazdirmaMetodlari_MenuUtils.AyracYazdir();
		}
	}
}
	
