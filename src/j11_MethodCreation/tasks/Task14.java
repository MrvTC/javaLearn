package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner input = new Scanner(System.in);
        System.out.println("Saatlik çalışma ücretini giriniz: ");
        double ucret = input.nextDouble();

        System.out.println("Günlük çalışma saatinizi giriniz: ");
        double  gunluk = input.nextDouble();

        System.out.println("mesai saatiniz : ");
        double mesaiSaati = input.nextDouble();

        if (mesaiSaati>=1){

        System.out.println("mesai saatiniz, saatlik ücretinizin kaç katı : ");
        double mesai = input.nextDouble();

        ToplamUcret(ucret,gunluk,mesaiSaati,mesai);

        }else System.out.println("bir günlük toplam ücretiniz: " + ucret*gunluk );

    }

    private static void ToplamUcret(double ucret,double gunluk, double mesaiSaati, double mesai) {

        double mesailiCalisma=mesai*ucret*mesaiSaati + ucret*gunluk;

        System.out.println("bir günde toplam alacağınız ücret: " + mesailiCalisma );

    }

}
