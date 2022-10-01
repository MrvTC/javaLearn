package j08_ifStatement_TernaryOperator.Task01;

import java.util.Scanner;

public class Q05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */


        Scanner input=new Scanner(System.in);
        System.out.println("enter your age");
        int age=input.nextInt();
        System.out.println("enter your weight");
        double w=input.nextDouble();
        if (age<18) {
            System.out.println("You can not donate blood");
        }
        else
        if (w<50){
            System.out.println("You can not donate blood");
        }
        else System.out.println("You can donate blood");





    }

}
