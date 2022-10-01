package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class _11_ArithmeticOperator_reminder1 {

    public static void main(String[] args) {

        /*  Verilen int ler hakkında (num1, num2),
            num1 'in   num2'ye bölümünden kalanı, int sonuc'a  eşitleyin.
            int sonucu yazdırın.  */

        Scanner input=new Scanner(System.in);
        System.out.println("bir numara giriniz: ");
        int num= input.nextInt();
        System.out.println("bir numara daha giriniz: ");
        int num1=input.nextInt();
        int b=(num%num1);
        int yeni=b;
        System.out.println( "Bölümünden kalan: "+yeni);


    }
}
