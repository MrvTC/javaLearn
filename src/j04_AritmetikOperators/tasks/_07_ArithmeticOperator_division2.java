package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _07_ArithmeticOperator_division2 {

    public static void main(String[] args) {

        /* Verilen int ler hakkında, (num1, num2),
            num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin.
            int sonucu yazdırın. */

        Scanner input=new Scanner(System.in);
        System.out.println("bir numara giriniz: ");
        int num= input.nextInt();
        System.out.println("bir numara daha giriniz: ");
        int num1=input.nextInt();
        int b=(num/num1);
        b=b ;
        System.out.println( "girdiğiniz sayıların bölüm sonucu: "+b);



    }
}
