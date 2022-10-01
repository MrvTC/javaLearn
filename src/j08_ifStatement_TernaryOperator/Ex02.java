package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        /*kullanıcıdan 100 üzerinden sayı iste. notu harf sistemine çevirip yaz.

        50 küçükse D
        =50 <60 C
        =60 <80 arası B
        =80 üzeri A
         */

        Scanner input = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = input.nextInt();
        for (int i = 0; i < not; i++)
          //   not =not1;
        //not1 < 100;

        {

        }

        if (not < 50) {
            System.out.println("D");
        } else if ((not >= 50) && (not < 60)) {
            System.out.println("C");
        } else if ((not == 60) && (not < 80)) {
            System.out.println("B");
        } else
            System.out.println("A");


    }

}














