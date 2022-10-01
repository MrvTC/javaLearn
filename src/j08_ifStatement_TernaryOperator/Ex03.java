package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        /*artık yıl
        4 ile bölünemeyen artık yıl deği
        4 ile bölünüp 100 ile bölünemeyen artık yıl
        4ün katı fakat 100 ile bölünebilen sadece 400ün katı olan yıllar

         */
        Scanner input=new Scanner(System.in);
        System.out.println( "bir sayı giriniz");
        int sayi= input.nextInt();
       if((sayi%4==0)&&(sayi %100!=0)||(sayi%400==0)){
           System.out.println("girdiğiniz yıl artık yıldır");

       }else
           System.out.println("artık yıl değildir");















    }
}
