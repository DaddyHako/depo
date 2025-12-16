package Bolum02alistirmalar;

import java.util.*;
public class ZamaniGoster {
	public static void main(String[] args) {
		System.out.println("Lütfen saniye cinsinden bir tam sayı giriniz: ");
		
		Scanner girdi = new Scanner(System.in);
		
		int saniye = girdi.nextInt();
		
		int dakika = saniye / 60;
		
		int kalanSaniye = saniye % 60;
		
		System.out.println(saniye + " saniye " + dakika + " dakika ve " + kalanSaniye + " saniyedir. ");
		
		
		
		
		
	}

}
