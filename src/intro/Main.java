package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//camelcase ilk harf küçük sonraki ilk harfler büyük
		//Don't Repeat Yourself = kendini tekrar etme
		String internetSubeButonu="İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade =36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düştü resmi");
			
		}else if(dolarBugun>dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		}
		
		else {
			System.out.println("Dolar eşittir resmi");
		}
		
		String kredi1 ="Hızlı Kredi";
		String kredi2 ="Konut Kredisi";
		String kredi3 ="Çiftçi Kredisi";
		String kredi4 ="Msb Kredisi";
		
		System.out.println();
		
		String[] krediler = 
			{"Hızlı Kredi","Konut Kredisi",
			 "Çiftçi Kredisi","Msb Kredisi"
				};
		
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		int sayi1=10;
		int sayi2=20;
		sayi1 = sayi2;
		sayi2 =100;
		System.out.println(sayi1);
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1 =sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1 ="Ankara";
		String sehir2 ="istanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
		
	}

}
