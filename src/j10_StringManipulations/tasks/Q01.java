package j10_StringManipulations.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir cümle yazınız: ");
        String cumle = input.nextLine();
        if(cumle.contains(" ")){
                System.out.println("boşluk var");
        }else
                System.out.println( "boşluk yok");














    }
}

