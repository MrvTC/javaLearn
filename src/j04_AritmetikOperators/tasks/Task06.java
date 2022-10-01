package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */

 Scanner input=new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz: ");
        int abc= input.nextInt();
       int c=abc%10;
       abc/=10;
       int b=abc%10;
       int a=abc/10;

        System.out.println("Girdiginiz sayinin birler basamagi :"+ c);
        System.out.println("Girdiginiz sayinin onlar basamagi :"+b);
        System.out.println("Girdiginiz sayinin yüzler basamagi :"+a);



    }
}
