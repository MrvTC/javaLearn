package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*charAt() methodu parametre int olarak girilen indexdeki char değerini
        return eder. index değeri 0'dan başlar.
         */
        String sehir="Istanbul";
        System.out.println("sehir = " + sehir.charAt(5));
        char besinciIndexKrkt=sehir.charAt(5);
        System.out.println(besinciIndexKrkt);

        System.out.println(sehir.charAt(sehir.length() - 1));
//son index karakter length()-1
        //System.out.println(sehir.charAt(18));//run time error verir


        Scanner in=new Scanner(System.in);
        System.out.println("kelimeyi gir");
        String kelime=in.nextLine();
        if(kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));
        }else System.out.println("girilem kelimenin orta karakteri yoktur");


    }
}
