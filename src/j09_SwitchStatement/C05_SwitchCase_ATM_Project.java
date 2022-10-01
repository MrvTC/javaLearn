package j09_SwitchStatement;


import java.util.Scanner;

public class C05_SwitchCase_ATM_Project {
    public static void main(String[] args) {

/*
Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı
 bie ATM app. code create ediniz
 */

        Scanner in = new Scanner(System.in);
        System.out.println("Güncel bakiye bilgisi için 1'i\npara yatırma için 2'yi\npara çekme için 3'ü\nçıkmak için 4'ü tıklayınız. ");
        int b = in.nextInt();
        int bakiye = 1000;
        switch (b) {
            case 1:
                System.out.println(bakiye + "Tl");
                break;
            case 2:
                System.out.println("ne kadarın var?");
                int paragiris = in.nextInt();
                System.out.println(bakiye + paragiris);
                break;
            case 3:
                System.out.println("ne kadar çekmek istersin?");
                int paraCikis = in.nextInt();
                System.out.println(bakiye >= paraCikis ? ("tabiki buyrun" + (bakiye + paraCikis)) : ("malesef bakiyen yetersiz.:( "));
                break;

            //System.out.println("ne kadar çekmek istersin?");
            //int paraCikis = in.nextInt();
            //if (bakiye >= paraCikis) {
            // System.out.println("tabiki buyrun" + " " + (bakiye + paraCikis));
            // } else
            //  System.out.println("malesef bakiyen yetersiz.:(");
            //break;
            case 4:
                System.out.println("Güle güle");
                break;
            default:
                System.out.println("malesef işlem tanımlanmadı");


        }


    }
}
