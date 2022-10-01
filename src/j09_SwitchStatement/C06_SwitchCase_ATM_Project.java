package j09_SwitchStatement;


import java.util.Scanner;

public class C06_SwitchCase_ATM_Project {
    public static void main(String[] args) {

/*
girilen haftanın gününü
 */

        Scanner in = new Scanner(System.in);
        System.out.println("bir gün giriniz");
        String b = in.next().toLowerCase();
        switch (b) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("hafta içi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("malesef böyle bir gün yok :( ");


        }


    }
}
