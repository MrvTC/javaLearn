package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {
    public static void main(String[] args) {
        // kullanıcıdan veri almak  için şu 3 adım takip edilir.
        //1.adım-> Scannerr class dan obj create edilir.

        //Scanner scan= new Scanner(System.in);// scanner classından scan isminden değerini sistem içinden alan bir obj...

        //2. adım-> kullanıcıdan istenen veri için bildirimde bulunur-> sout("...");

        //System.out.println("adınızı giriniz :");

        //3.adım kullanıcının girdiği veri data tipine göre bir variable a atanır.

        //String isim=  scan.nextLine();//kullanıcıdan gelen string tipinde isim verisi scan obj ni nextline metoduyla
        //atandı.

        //System.out.println("isim = " + isim);

        //TASK-> kullanıcının girdiği değere göre kare alanı ve çevresini hesaplayan bir code yaz.
        Scanner sc= new Scanner(System.in);
       // System.out.print("kare kenarı giriniz:");
        //int kenar= sc.nextInt();
        //System.out.println("alan: "+(kenar*kenar)+" çevre: "+(kenar*4));

        /* kullanıcının günde içtiği çay ve kullandığı şeker değerine göre bir yılda kaç kg şeker kullandığını
        hesaplayan bir code create ediniz.
        1 şeker= 1.7 gr
        Örnek: Input: çay sayısı: 10 şeker sayısı:2
        output:yılda 12.41 kg şeker kullanıyorsunuz.
         */
        System.out.println("günlük içtiğiniz çay sayısını giriniz:");
        int caySayisi=sc.nextInt();

        System.out.println("şeker sayınızı giriniz:");
        int sekerSayisi=sc.nextInt();
        System.out.println("yıllık şeker tüketiminiz:"+ (caySayisi*sekerSayisi*1.7*365)/1000);

        System.out.println("isminizi giriniz: ");
        char ch=sc.nextLine().charAt(0);// kullanıcıdan gelen string ifadenin 0. indeks ilk karakterini alır.
        System.out.println("ilk karakteri girin: "+ch);



    }


}
