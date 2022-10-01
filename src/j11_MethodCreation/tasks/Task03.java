package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.


        Scanner sc = new Scanner(System.in);
        System.out.println("saati giriniz");
        int saat = sc.nextInt();

        System.out.println("mil girin");
        int mil = sc.nextInt();


        System.out.println("kg girin");
        int kg = sc.nextInt();

        saatiSaniyeye(saat);
        miliKilometre(mil);

        kilogramıGram(kg);

    }

    private static void kilogramıGram(int kg) {

        double gram = kg * 1000;
        System.out.println(gram + " Gram");
    }

    private static void miliKilometre(int mil) {

        double kilometre = mil * 1.6;
        System.out.println(kilometre + " Kilometre");
    }

    private static void saatiSaniyeye(int saat) {

        int saniye = saat * 3600;
        System.out.println(saniye + " Saniye");


    }


}
