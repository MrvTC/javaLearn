package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner input=new Scanner(System.in);
        System.out.println("Dik üçgenin kısa kenarını yazınız");
        int Uzunkenar= input.nextInt();
        System.out.println("Dik üçgenin uzun kenarını yazınız");
        int kisaKenar= input.nextInt();
        System.out.println("Dik üçgenin hipotenüsü: " + Math.sqrt(Uzunkenar*Uzunkenar+kisaKenar*kisaKenar));




    }
}
