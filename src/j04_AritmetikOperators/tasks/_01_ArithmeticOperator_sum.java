package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */

   Scanner input= new Scanner(System.in);
        System.out.println("numara giriniz: ");
        int h=input.nextInt();
        System.out.println("bir numara daha giriniz: ");
        int m= input.nextInt();
        System.out.println("toplamı: "+ (h+m));

    }
}
