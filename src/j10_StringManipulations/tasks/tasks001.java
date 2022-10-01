package j10_StringManipulations.tasks;

import java.util.Scanner;

public class tasks001 {
    public static void main(String[] args) {

//bir cümlede aranan kelimeyi bulan bir code create et. ternary kullan.

        Scanner in= new Scanner(System.in);
        System.out.println("istediğiniz bir cümle giriniz:");
        String cumle=in.nextLine();
        System.out.println("hangi kelimeyi aradınız?");
        String arananKelime=in.nextLine();
        System.out.println(cumle.contains(arananKelime) ? "kelimeniz mevcut" : "maalesef bulunamadı");
















    }

}

