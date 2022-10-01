package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir cümle giriniz.");
        String cumle = sc.nextLine().toLowerCase();

        HackerDili(cumle);

    }

    private static String HackerDili(String cumle) {

        String HackerDili=cumle.replace('a', '4');
        String HackerDili1=HackerDili.replace('s', '5');
        String HackerDili2=HackerDili1.replace('e', '3');
        String HackerDili3=HackerDili2.replace('i', '1');
        String HackerDili4=HackerDili3.replace('o', '0');

        System.out.println(HackerDili4);

        return HackerDili4;

    }


}