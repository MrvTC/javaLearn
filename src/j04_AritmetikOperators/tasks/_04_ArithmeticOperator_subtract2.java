package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _04_ArithmeticOperator_subtract2 {

    public static void main(String[] args) {

        /*
        Verilen 4 tane int (num 1, num2 , num3 , num4),
        Int'leri birbirinden çıkarın.
        Sonucu yazdırın.
        Örneğin;
        num1 = 90
        num2 = 40
        num3 = 10
        num4 = 10
        Sonuc 30 olmalı.
         */

        Scanner fark=new Scanner(System.in);
        System.out.println("num1 giriniz: ");
        int num1=fark.nextInt();
        System.out.println("num2 giriniz: ");
        int num2=fark.nextInt();
        System.out.println("num3 giriniz: ");
        int num3=fark.nextInt();
        System.out.println("num4 giriniz: ");
        int num4= fark.nextInt();
        System.out.println("farkınız: "+(num1-num2-num3-num4));

    }
}
