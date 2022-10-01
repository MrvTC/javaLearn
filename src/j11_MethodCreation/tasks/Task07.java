package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("üç tane sayı giriniz");
        int sayi = sc.nextInt();
        int sayi1 = sc.nextInt();
        int sayi2 = sc.nextInt();

        sıralama(sayi, sayi1, sayi2);

    }

    private static void sıralama(int sayi, int sayi1, int sayi2) {

        if (sayi < sayi2 && sayi < sayi1) {

            System.out.println("en küçük değer: " + sayi);
        } else if (sayi1 < sayi && sayi1 < sayi2) {
            System.out.println("en küçük değer: " + sayi1);
        } else {
            System.out.println("en küçük değer: " + sayi2);
        }


    }


}

