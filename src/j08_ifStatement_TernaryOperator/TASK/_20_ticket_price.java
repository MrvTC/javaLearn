package j08_ifStatement_TernaryOperator.TASK;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
        55 hız sınırıdır.

        Eğer hızınız 55-74 arasında ise:
        Ceza 100 $'dır.

        Eğer hızınız 75 - 84 arasında ise:
        Ceza 150 $'dır.

        Eğer hızınız 85 -94 arasında ise:
        Ceza 320 $'dır.

        Eğer hızınız 94'den daha fazla ise:
        Ceza 500 $'dır.

        ve ayrıca,
        Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

        Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */

        Scanner scan = new Scanner(System.in);

        System.out.println("Hızı kaç?");
        int hız = scan.nextInt();
        int ehliyetceza = 0;
        int hizceza = 0;

        if (hız < 56) {
            hizceza = 0;
        } else if (hız < 75) {
            hizceza = 100;
        } else if (hız < 85) {
            hizceza = 150;
        } else if (hız < 95) {
            hizceza = 320;
        } else {
            hizceza = 500;
        }


        System.out.println("ehliyet durumu nedir?");
        boolean ehliyet = scan.nextBoolean();
        if (ehliyet == true) {
            ehliyetceza = 0;
        } else {
            ehliyetceza = 200;
        }
        System.out.println("ödenmesi gereken: " + (ehliyetceza + hizceza) + "$");
    }
}










