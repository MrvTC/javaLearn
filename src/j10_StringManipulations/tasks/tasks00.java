package j10_StringManipulations.tasks;

import java.util.Scanner;

public class tasks00 {
    public static void main(String[] args) {
        //task-> girilen e mail hesabını @gmail.com içermiyorsa "lütfen gmail hesabı giriniz."
        //@gmail.com ile bitiyorsa "hesabınız onaylandı" aksi durumda geçerli hesap giriniz
        //print eden code create ediniz.

        Scanner in=new Scanner(System.in);
        System.out.println("e mail adresinizi giriniz.");
        String adress=in.nextLine();
        String adress1="@gmail.com";
        if (!adress.contains(adress1)){
            System.out.println("lütfen gmail hesabı gir.");
        }else if (adress.endsWith(adress1)) {
            System.out.println("hesabınız onaylandı");
        }else
            System.out.println("geçerli hesap giriniz");







    }











}

