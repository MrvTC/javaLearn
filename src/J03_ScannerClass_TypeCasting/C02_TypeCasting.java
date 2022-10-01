package J03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {

    /* byte< short< int< long< float< double
    Auto widenin costing-> küçük data typlerini büyük data typlerine java otomatik olarak yapar.
     */


    public static void main(String[] args) {

        double d =17;//double variable a int 17 atandı k->b
        System.out.println("d = " + d);

        int sayi1=33;
        int sayi2=7;
        System.out.println(sayi1/sayi2);// 4
        /* java iki int sayısı biribirine böldüğünüzde sonucu int verir.eğer bölme işleminde ondalık sonuç çıkarsa
        ondalık kısmı siler.
         */
        byte b=127;
        int i=b;//k->b auto widenin
        System.out.println("i = " + i);//127

        int num=1453;
        double d1=17;//num;//k->b aw
        System.out.println("d1 = " + d1);//1453.0

        double db=d1/num;//iki farklı data type sayı işleme girerse java küçük olan data type türü için aw yapar
        //sonucu büyük olan data type olarak verir.
        System.out.println("db = " + db);//db=0.011699931

        /* byte<short<int<long<float<double
        Explicit Narrowing Casting-> büyük data typlerini küçük data tiplerine çevirme işlemini veri kaybından dolayı
        java otomatik olarak yapmaz. code ile teyit ister.
         */
        double d2=14.53;
        //int num2= d2;//b->k
         int num2=(int) d2;
        System.out.println("num2 = " + num2);//14
        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = " + b1);

        double d4=571.9444;
        long l2=(long)d4;
        System.out.println("l2 = " + l2);//l2=571

        //TASK-> kullanıcıdan bir char girmesini iste
        //girilen char ı ve ascii değerini yaz.

        //Örnek: ınput:a
        //output: girdiğiniz 'a' karakterinin ascii değeri:95

        Scanner input=new Scanner(System.in);//1.adım
        System.out.println("ascii değeri gir");//2. adım
       char ch=input.nextLine().charAt(0);
int chasliDegeri=ch;
        System.out.println(ch+"'ın chasliDegeri="+ chasliDegeri);//$ ın chascideğeri=36

    }
}