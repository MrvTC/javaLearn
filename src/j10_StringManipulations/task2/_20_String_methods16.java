package j10_StringManipulations.task2;

import java.util.Scanner;

public class _20_String_methods16 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String kelime = sc.nextLine();
        System.out.println(kelime.contains(" ") ? "boşluk var" : "boşluk yok");
        System.out.println(kelime.isEmpty() ? "boş" : "boş değil");



    }
}
