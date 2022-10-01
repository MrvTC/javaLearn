package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _08_ArithmeticOperator_multiply1 {

    public static void main(String[] args) {

        /* Verilen 3 double hakkında, (num1 , num2, num3),
            Bu üç double'ı birbiriyle çarpın ve cevabı  sonuca eşitleyin.
            Sonucu yazdırın.  */

        Scanner kod= new Scanner(System.in);
        System.out.println("1. kodu giriniz: ");
        double kod1=kod.nextDouble();
        System.out.println("2. kodu giriniz: ");
        double kod2=kod.nextDouble();
        System.out.println("3. kodu giriniz: ");
        double kod3=kod.nextDouble();
        double çarpım=kod1*kod2*kod3;
        çarpım=çarpım;

        System.out.println("kod değerinizin çarpımı: "+çarpım);






    }
}
