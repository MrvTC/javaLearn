package J03_ScannerClass_TypeCasting.tasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task04 {
    private static Object $;

    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner input= new Scanner(System.in);
        System.out.println("isim: ");
        String isim= input.nextLine();
        System.out.println("Soyad:");
        String soyad= input.next();
        System.out.println("yaşınızı giriniz: ");
        int yas= input.nextInt();
        System.out.println("kilonuz giriniz: ");
        int kilo= input.nextInt();
        System.out.println("boyunuzu giriniz: ");
        int boy= input.nextInt();
        System.out.println("Devam edeceğiniz süreyi giriniz: ");
        int devamSüresi= input.nextInt();
        System.out.println("Ödemeniz gereken toplam tutar: " + (20*devamSüresi)+"$");




    }
}
