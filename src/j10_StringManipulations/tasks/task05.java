package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {


        /* Task->
Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
 */
        Scanner input=new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String isim=input.nextLine();
        System.out.println("soyadınızı giriniz");
        String soyisim=input.nextLine();
        System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1));
        System.out.println(soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1));

    }
}
