package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */


        Scanner sc = new Scanner(System.in);
        System.out.println("lütfen hesabınızı giriniz.");
        String hesap = sc.nextLine();

        if ((hesap.contains(" "))) {

            System.out.println("hesabınız boşluk içermemeli.");

        } else
            System.out.println(hesapEnter(hesap));

    }

    private static Boolean hesapEnter(String hesap) {

        Boolean hesapEnter = true;

        if (hesap.endsWith("@gmail.com") && hesap.indexOf("@") > 0) {
            hesapEnter = true;

        } else
            hesapEnter = false;

        return hesapEnter;


    }


}