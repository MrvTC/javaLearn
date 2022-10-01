package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		

 Scanner input= new Scanner(System.in);
		System.out.println("Bir tamsayı yazınız.");
		int tamsayi= input.nextInt();
		System.out.println("Bir tamsayı daha giriniz:");
		int tamsayi1= input.nextInt();
		System.out.println("İki sayının toplamı: "+ (tamsayi1+tamsayi));
		System.out.println("İki sayının çarpımı: "+ tamsayi1*tamsayi);
		System.out.println("Aradaki fark: "+ (tamsayi-tamsayi1));
		System.out.println("İki sayının birbirine bölümü: "+ (tamsayi/tamsayi1));



	}

}
