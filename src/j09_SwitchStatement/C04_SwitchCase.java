package j09_SwitchStatement;


import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {

//TASK -> kullanıcının girdiği yılın ay sırasına göre ayınism

        Scanner in = new Scanner(System.in);
        System.out.println("bir ay yazınız ");
        String b = in.nextLine();
        switch (b) {
            case "ocak":
                System.out.println("kış ");
                break;
            case "şubat":
                System.out.println("kış");
                break;
            case "mart":
                System.out.println("ilkbahar");
                break;
            case "nisan":
                System.out.println("ilkbahar");
            case "mayıs":
                System.out.println("ilkbahar");
                break;
            case "haziran":
                System.out.println("yaz");
                break;
            case "temmuz":
                System.out.println("yaz");
                break;
            case "ağustos":
                System.out.println("yaz");
                break;
            case "eylül":
                System.out.println("sonbahar");
                break;
            case "ekim":
                System.out.println("sonbahar");
                break;
            case "kasım":
                System.out.println("sonbahar");
                break;
            case "aralık":
                System.out.println("kış");
                break;
            default:
                System.out.println("lütfen ay ismi yazınız");
                

        }


    }
}
