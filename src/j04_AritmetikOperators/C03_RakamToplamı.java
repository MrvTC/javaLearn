package j04_AritmetikOperators;

import java.util.Scanner;

public class C03_RakamToplamı {

    public static void main(String[] args) {


        //kullanıcıdan alınan üç basamaklı bir sayının rakamları toplamını print ediniz.

        Scanner input= new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz: ");
        int abc= input.nextInt();
        int a=abc/100;
      abc%=100;
      int b=abc/10;
      int c=abc%10;
        System.out.println("rakamlar toplamı: " +(a+b+c));




    }
}
