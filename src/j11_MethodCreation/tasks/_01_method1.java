package j11_MethodCreation.tasks;

import java.util.Random;
import java.util.Scanner;

public class _01_method1 {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum), aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayi = sc.nextInt();
        randomNum(sayi); //random sayı demek rastgele [0-1) arasında bir sayı döndürecek demek. Aynı sayıyı sürekli yazınca bize farklı sonuçlar print ediyor.
                           // https://www.javatpoint.com/how-to-generate-random-number-in-java --> bu linkte konuyu güzel anlatıyor bkz.
    }

    private static int randomNum(int sayi) { //randomNum methodu tanımladım.işlemimi burada yapıyorum

     int max= (int) (Math.random()*sayi);// random rastgele 0 ile 1 arasında bir değer alır.
     int max1= (int) (Math.random()*sayi);// random rastgele 0 ile 1 arasında bir değer alır.
     int max2= (int) (Math.random()*sayi);// random rastgele 0 ile 1 arasında bir değer alır.
     int max3= (int) (Math.random()*sayi);// random rastgele 0 ile 1 arasında bir değer alır.
                                         // Rastgele aldığı bu değeri kullanıcının verdiği değerle çarpsın dedim

     System.out.println(max);
     System.out.println(max1);
     System.out.println(max2);
     System.out.println(max3);


        return (int) max;
    }


}



