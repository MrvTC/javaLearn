package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _10_Arithmetic_Operator_multiply3 {

    public static void main(String[] args) {

        /* Oluşturulmuş olan int ler hakkında, (num1, num2 , num3, num4),
        Bu int'leri birbiriyle çarpın ve sonuca eşitleyin.
        int sonuc u yazdırın. */
        Scanner kod= new Scanner(System.in);
        System.out.println("1. kodu giriniz: ");
        int kod1=kod.nextInt();
        System.out.println("2. kodu giriniz: ");
        int kod2=kod.nextInt();
        System.out.println("3. kodu giriniz: ");
        int kod3=kod.nextInt();
        System.out.println("4. kodu giriniz: ");
        int kod4=kod.nextInt();
        int çarpım=kod1*kod2*kod3*kod4;
        System.out.println("kod değerinizin çarpımı: "+çarpım);



    }
}
