package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        /*girilen sayının pozitif ve negatifliğini kontrol et

         */
        Scanner input=new Scanner(System.in);

        System.out.println("bir sayı gir");
        int sayi=input.nextInt();
        if (sayi>0){
            System.out.println("pozitif");
        }
        else if (sayi<0){
            System.out.println("negatif");
        }
        else {
            System.out.println("nötrdür");
        }

//

    }



}
