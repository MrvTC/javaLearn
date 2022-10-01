package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        Scanner kod= new Scanner(System.in);
        System.out.println("1. kodu giriniz: ");
        int kod1=kod.nextInt();
        System.out.println("2. kodu giriniz: ");
        int kod2=kod.nextInt();
        System.out.println("3. kodu giriniz: ");
        int kod3=kod.nextInt();
        System.out.println("4. kodu giriniz: ");
        int kod4=kod.nextInt();
        System.out.println("toplam kod değeriniz: "+(kod1+kod2+kod3+kod4));




    }
}
