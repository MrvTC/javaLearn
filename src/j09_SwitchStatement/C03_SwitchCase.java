package j09_SwitchStatement;


import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {

//TASK -> kullanıcının girdiği yılın ay sırasına göre ayınism

        Scanner in = new Scanner(System.in);
        System.out.println("bir ay yazınız lütfen(sayıyla) ");
        int b = in.nextInt();
        switch (b) {
            case 1:
                System.out.println("31 gün");
                break;
            case 2:
                System.out.println("yılınızı giriniz");
                int artıkyıl=in.nextInt();
                System.out.println((artıkyıl%4==0)+ "29 gündür.");
                break;
            case 3:
                System.out.println("31 gün");
                break;
            case 4:
                System.out.println("30");
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("30");
                break;
            case 9:
                System.out.println("31");
                break;
            case 10:
                System.out.println("30");
                break;
            case 11:
                System.out.println("31");
                break;
            case 12:
                System.out.println("30");
                break;
            default:
                System.out.println("lütfen 12 ye kadar yazınız");
                

        }


    }
}
