package j08_ifStatement_TernaryOperator.Task01;

import java.util.Scanner;

public class Q020 {
    public static void main(String[] args) {


       /* Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin
         */

        Scanner sayı = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        double s = sayı.nextDouble();
        if (s > 0) {
            if (s > 10) {
                System.out.println("Büyüksün Kral!");
            } else System.out.println("Normalsin");
        } else if (s > -10) {
            System.out.println("Negatifsin");
        } else System.out.println("Çok Negatifsin");


    }

}
