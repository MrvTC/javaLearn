package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner Uykusaati= new Scanner(System.in);
        System.out.println("günde kaç saat uyuduğunuzu yazınız:");
        int uyku= Uykusaati.nextInt();
        System.out.println("Ayda: "+30*uyku/24);
        System.out.println("1 yılda = " +uyku*365/24 );
        System.out.println("40 yılda: " +uyku*40*365/24);

    }
}
