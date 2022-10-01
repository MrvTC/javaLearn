package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir yıl giriniz.");
        int yil = sc.nextInt();


        ArtıkYıl(yil);

    }

    private static int ArtıkYıl(int yil) {

        int ArtikYil = yil % 4;

        if (ArtikYil == 0) {

            System.out.println("true");
        } else System.out.println("false");

        return ArtikYil;

    }
}
