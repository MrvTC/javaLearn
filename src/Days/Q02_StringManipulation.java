package Days;

import java.util.Scanner;

public class Q02_StringManipulation {

    public static void main(String[] args) {


//Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.


        Scanner input=new Scanner(System.in);
        System.out.println("string 1: ");
        String str1=input.nextLine();
        System.out.println("string 1: ");
        String str2=input.nextLine();
String ilkSiz= str1.substring(1);
String ilksiz1=str2.substring(1);
        System.out.println("1. metod ile birleşim: " + str1.concat(" "+str2));
        System.out.println(ilkSiz + " " + ilksiz1);




    }

}
