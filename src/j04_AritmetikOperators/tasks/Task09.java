package j04_AritmetikOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayark sayısını hesaplayalım.

     */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("çiftliğinizde kaç tane inek var?");
        int inek=input.nextInt();
        System.out.println("çiftliğinizde kaç koyun var?");
        int koyun= input.nextInt();
        System.out.println("çiftliğinizde kaç tavuk var");
        int tavuk= input.nextInt();
        System.out.println("çiftliğinizdeki koyun, inek ve tavuğun toplam ayak sayısı: "+(inek*4)+(koyun*4)+(tavuk*2));

    }

}
