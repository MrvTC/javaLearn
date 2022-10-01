package J01_Variables;

public class HelloWorld {public static void main(String[] args) {//main method başı
    System.out.println("hello world");{
        /*
        çoklu satır yorum(multi-line comment)..
        başarı gayrete aşıktır
        bahanesi olanın başarısı olmaz..
         */

    // burası sadete tek satır(single-line comment) yorum alır. alt satıra geçilirse komut olarak tanımlanır...

        /*
        Java run edildiğinde çalışmaya ilk önce main method'dan başlar
        daha sonra yukarıdan aşağıya ve soldan sağa soğru sırasıyla code'ları çalıştırır
         */
    System.out.println("javaCAN'lara selam olsun :) ");// ; " ) unut hata al run et konsolda  problems de pencere aç göster
    //System.out.print("java bilen sırtı yere gelmez..."); //çalışmasını istemediğin kodun başına yorum (//) işareti konulur.

        //imlecin olduğu satır CTRL+d ile alt satıra kopyalanır.
        System.out.println("başarı gayrete aşıktır");
        System.out.println("başarı gayrete aşıktır");
    // TRICK :)
    //Java code satırı  cumle(Statement) sonuna mutlaka  ";" koyulmalı.
    //Code'da  kirmizi alt cizgi görülmesi "Compile Time Error" CTE hatası uyarısı demektir.
    //Bu hatayi duzetlmeden(handle) baska kod yazmayınız...

        /* TRICK :)
        print -> yazdırma işleminden sonra bir sonraki komutu AYNI satırdan devam ettirir
        println -> yazdırma işleminden sonra bir sonraki komutu ALT satırdan devam ettirir

         */
    /* satırları yoruma almak istiyorsan multiline yani /* çoklu satır yapıyorsun ardından yorumun bitmesini istediğin
          satıra gelip enter yapıyorsun.


     */
        /*
        TASK :
        Adınızı soyadınızı yaş memeleket ve mesleğinizi console'a yazdırınız... alt alta ve yanyana yazdırınız..
        TRICK : Java'da space(boşluk) bir character olarak tanımlanır.
        h a l u k -> 9 karakterli bir ifadedir

         */
}//main method sonu
}//class sonu
}
