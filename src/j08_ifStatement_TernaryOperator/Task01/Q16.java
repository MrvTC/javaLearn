package j08_ifStatement_TernaryOperator.Task01;

import java.util.Scanner;

public class Q16 {
/* TASK :
    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen üç adet sayı giriniz. ");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        if (sayi1 > sayi2 && sayi1 > sayi3) {
            if (sayi2 > sayi3) {
                System.out.println(sayi1 + " " + "en büyük sayıdır\n" + sayi3 + " " + "en küçük sayıdır.");
            } else {
                System.out.println(sayi1 + " " + "en büyük sayıdır\n" + sayi2 + " " + "en küçük sayıdır.");
            }
        } else if (sayi2 > sayi1 && sayi2 > sayi3) {
            if (sayi1 > sayi3)
                System.out.println(sayi2 + " " + "en büyük sayıdır\n" + sayi3 + " " + "en küçük sayıdır.");
            else System.out.println(sayi2 + " " + "en büyük sayıdır\n" + sayi1 + " " + "en küçük sayıdır.");
        }
               else  {
                   if(sayi2 > sayi1) {
                       System.out.println(sayi3 + " " + "en büyük sayıdır\n" + sayi1+ " " + "en küçük sayıdır.");
                   }else {
                           System.out.println(sayi3 + " " + "en büyük sayıdır\n" + sayi2 + " " + "en küçük sayıdır.");
                 }
                   }

    }
}


