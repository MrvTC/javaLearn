package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class merve {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int hizCeza = 0, ehliyetCeza = 0;
		System.out.print("Lütfen hızınızı yazınız : ");
    int hiz = scan.nextInt();

		if (hiz >= 55 && hiz <= 74) {
        hizCeza = 100;
    }else if (hiz >= 75 && hiz <= 84) {
        hizCeza = 150;
    }else if (hiz >= 85 && hiz <=94) {
        hizCeza = 320;
    }else {
        hizCeza = 500;
    }
		System.out.print("Ehliyetin var mı gardaş??? Varsa -> True - Yoksa -> False :     ");
    boolean ehliyet = scan.nextBoolean();
		if (ehliyet == true) {
        ehliyetCeza = 0;
    }else {
        ehliyetCeza = 200;
    }

		System.out.println( hiz +  " km/saat hız yaptığın için : " + hizCeza +"$");
		if (ehliyet == false) {
        System.out.println("Ehliyetin olmadığı için de 200$ ceza aldın");
    }
		System.out.println("toplam ceza tutarın " + (ehliyetCeza + hizCeza) + " $ dır. Git baban ödesin şimdi....");
}
        }
