package Days;

import java.util.Scanner;

public class Q01_StringManipulation {
    public static void main(String[] args) {


//Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen isminizi ve soyadınızı yazın");
String name=input.nextLine(), lastname= input.nextLine();
String fulname=name.concat(" " + lastname).toUpperCase();
        System.out.println("fulname= "+ fulname);













    }
}
