package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _09_ArithmeticOperator_multiply2 {

    public static void main(String[] args) {

    /*    Oluşturulmuş olan double'lar hakkında,
        Bu 4 doubleyi  birbiriyle çarpın ve sonuca  eşitleyin.
        Double sonucu yazdırın.   */


        Scanner kod= new Scanner(System.in);
        System.out.println("1. kodu giriniz: ");
        double kod1=kod.nextDouble();
        System.out.println("2. kodu giriniz: ");
        double kod2=kod.nextDouble();
        System.out.println("3. kodu giriniz: ");
        double kod3=kod.nextDouble();
        System.out.println("4. kodu giriniz: ");
        double kod4=kod.nextDouble();
        double çarpım=kod1*kod2*kod3*kod4;
        System.out.println("kod değerinizin çarpımı: "+çarpım);


    }
}
