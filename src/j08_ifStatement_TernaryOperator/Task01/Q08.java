package j08_ifStatement_TernaryOperator.Task01;

import java.util.Scanner;

public class Q08 {
    /*
     * TASK :

     * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
     * musteri karti olup olmadigini sorun
     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
     * alirsa %10 indirim yapan code create ediniz.
     */
    public static void main(String[] args) {

        Scanner shop=new Scanner(System.in);
        System.out.println("ürün adedinizi girin");
        int ürün=shop.nextInt();
        System.out.println("liste fiyatınızı girin");
        double listeFiyatı=shop.nextDouble();
        System.out.println("müşteri kartınız var mı? \nVarsa: "+" "+"True"+"\nyoksa: "+" "+"false"+" "+"yazınız.");
        boolean karttipi=shop.nextBoolean();
        boolean kart=true;
        boolean kart1=false;
        if (kart){
            if( ürün>10)
                System.out.println("indirimli ürün fiyatı: "+((ürün*listeFiyatı-(ürün*listeFiyatı)/5)));

            else System.out.println("indirimli ürün fiyatı: "+((ürün*listeFiyatı-(ürün*listeFiyatı)*15/100)));
        }
        if(kart1) {
            if (ürün>10) {
                System.out.println("indirimli ürün fiyatı: " + ((ürün*listeFiyatı - (ürün*listeFiyatı) * 15 / 100)));

            }else System.out.println("yine de indirimli fiyatınız: :)" + " "+((ürün - (ürün)/10)));


        }
    }




    }


