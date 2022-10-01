package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
  Scanner input=new Scanner(System.in);
        System.out.println("Vize1 notunuzu giriniz: ");
        int v= input.nextInt();
        System.out.println("Vize2 notunuzu giriniz: ");
        int v2= input.nextInt();
        System.out.println( "Final notunuzu giriniz: ");
        int f= input.nextInt();
        System.out.println("Geçme notunuz: "+ ((v+v2)/2*3/10+ f*7/10));

    }
}
