package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.
              Boolean'ı yazdırınız.   */

        Scanner input= new Scanner(System.in);
        System.out.println("Bir banka hesabınız var mı?");
        Boolean hesap=input.nextBoolean();
        System.out.println("teşekkürler");
    }
}
