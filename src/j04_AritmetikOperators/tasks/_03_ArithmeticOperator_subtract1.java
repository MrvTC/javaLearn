package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

 Scanner input=new Scanner(System.in);
        System.out.println("bir numara giriniz: ");
        int num= input.nextInt();
        System.out.println("bir numara daha giriniz: ");
        int num1=input.nextInt();
        System.out.println( "girdiğiniz sayıların farkı: "+(num-num1));




    }
}
