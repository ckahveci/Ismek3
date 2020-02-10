package homework3;

public class YazdirmaMetodlari_MenuUtils {

	public static void main(String[] args) {
		ProgramBasligi();
		ProgramBasligiParamatreli("Bilisim Okulu");
		AyracYazdir();
		IslemSonucuYazdir("Ýsmek", 12345);
	}

	static void ProgramBasligi() {
		System.out.println("****************************Fatih Bilisim Okulu**************************");
		System.out.println("*************************************************************************");

	}

	static String ProgramBasligiParamatreli(String parametre) {
		System.out.println("**************************** " + parametre + " ******************************");
	//	System.out.println("**************************************************************************");
		return parametre;
	}

	static void AyracYazdir() {
		System.out.println("\n**************************************************************************\n");
	}

	static void IslemSonucuYazdir(String Baslik, int Deger) {
		System.out.println("*************************** " + Baslik + "=" + Deger + " *******************************");

	}

}


