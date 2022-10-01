package j10_StringManipulations.tasks;

import java.util.Scanner;

public class tasks0014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" 3 basamaklı sayi giriniz :");
        int sayi = scan.nextInt();
        int yüzler = sayi / 100;
        int onlar = (sayi / 10) % 10;
        int birler = sayi % 10;

        if (sayi > 99 && sayi < 1000) {

        switch (birler) {

            case 0:
                System.out.println("birler basamağı:SIFIR");
                break;
            case 1:
                System.out.println("birler basamağı:BİR");
                break;
            case 2:
                System.out.println("birler basamağı:İKİ");
                break;
            case 3:
                System.out.println("birler basamağı:ÜÇ");
                break;
            case 4:
                System.out.println("birler basamağı:DÖRT");
                break;
            case 5:
                System.out.println("birler basamağı:BEŞ");
                break;
            case 6:
                System.out.println("birler basamağı:ALTI");
                break;
            case 7:
                System.out.println("birler basamağı:YEDİ");
                break;
            case 8:
                System.out.println("birler basamağı:SEKİZ");
                break;
            case 9:
                System.out.println("birler basamağı:DOKUZ");
                break;
            default:
        }
        switch (onlar) {
            case 1:
                System.out.println("ON");
                break;
            case 2:
                System.out.println("YİRMİ");
                break;
            case 3:
                System.out.println("OTUZ");
                break;
            case 4:
                System.out.println("KIRK");
                break;
            case 5 :
                System.out.println("ELLİ");
                break;
            case 6:
                System.out.println("ALTMIŞ");
                break;
            case 7:
                System.out.println("YETMİŞ");
                break;
            case 8:
                System.out.println("SEKSEN");
                break;
            case 9:
                System.out.println("DOKSAN");
                break;
            default:
        }
        switch (yüzler) {

            case 1:
                System.out.println("yüz");
                break;
            case 2:
                System.out.println("İKİYÜZ");
                break;
            case 3:
                System.out.println("ÜÇYÜZ");
                break;
            case 4:
                System.out.println("DÖRTYÜZ");
                break;
            case 5:
                System.out.println("BEŞYÜZ");
                break;
            case 6:
                System.out.println("ALTIYÜZ");
                break;
            case 7:
                System.out.println("YEDİYÜZ");
                break;
            case 8:
                System.out.println("SEKİZYÜZ");
                break;
            case 9:
                System.out.println("DOKUZYÜZ");
                break;

            default:
                System.out.println("hatalı giriş");
        }
        } else System.out.println("hatalı");

    }
}


