package Bolum02alistirmalar;

public class SuAnKiSaatiGosterB02S08 {

	public static void main(String[] args) {
		
		long toplamMiliSaniye = System.currentTimeMillis();
		
		System.out.println("1 Ocak 1970 yılından bu tarihe kadar Toplam Mili Saniye: " + toplamMiliSaniye);
		
		long toplamSaniye = toplamMiliSaniye / 1000;
		
		System.out.println("toplamSaniye: " + toplamSaniye);
		
		long suAnkiSaniye = toplamSaniye % 60;
		
		System.out.println("suAnkiSaniye: " + suAnkiSaniye);
		
		long toplamDakika = toplamSaniye / 60;
		
		System.out.println("toplamDakika: " + toplamDakika);
		
		long suAnkiDakika = toplamDakika % 60;
		
		System.out.println("suAnkiDakika: " + suAnkiDakika);
		
		long toplamSaat = toplamDakika / 60;
		
		System.out.println("toplamSaat: " + toplamSaat);
		
		long suAnkiSaat = toplamSaat % 24;
		
		System.out.println("suAnkiSaat: " + suAnkiSaat);
		
		System.out.println(suAnkiSaat + ":" + suAnkiDakika + ":" + suAnkiSaniye + "GMT" );
		
		
		System.out.println(suAnkiSaat + 3 + ":" + suAnkiDakika + ":" + suAnkiSaniye + " Türkiye Saati" );
		
	}

}
