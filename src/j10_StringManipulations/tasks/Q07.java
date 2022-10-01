package j10_StringManipulations.tasks;

import javax.swing.*;
import java.util.Scanner;


public class Q07 {

    /* TASK :
     * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
     * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
     * Test data: ali eme all
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 3 harfli bir kelime giriniz: ");
        String kelime = input.next();
     int krktrsayi = kelime.length();


        char kelime1=kelime.charAt(0);
        char kelime2=kelime.charAt(1);
        char kelime3=kelime.charAt(2);

        System.out.println(krktrsayi == 3 && kelime1!=kelime2 && kelime1!=kelime3 && kelime2!=kelime3 ? "tebrikler" : "lütfen üç harfli birbirinden farklı bir kelime yazınız." );


        int sayi = input.nextInt();
        input.nextLine();
        System.out.println("kelime");
        String kelimee=input.nextLine();
        double sayi1=input.nextDouble();

        System.out.println( "String: " + kelimee + "\nDouble: " + sayi1 + "\nInt: " + sayi );

    }
}








