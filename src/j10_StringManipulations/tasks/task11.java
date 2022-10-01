package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan = new Scanner(System.in);
        System.out.print("Ad Soyad : ");
        String s = scan.nextLine().toUpperCase();
        System.out.println(s.substring(0, s.indexOf(" ")) + "\n" + s.substring(s.indexOf(" ",-1)));


    }
}
