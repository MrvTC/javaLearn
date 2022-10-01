package j08_ifStatement_TernaryOperator.Task01;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */

        // Scanner input=new Scanner(System.in);
        //System.out.println("Please enter your height in meters");
        // double H=input.nextDouble();
        // System.out.println("Please enter your weight in kilograms");
        // double W=input.nextDouble();
        // double BMI=W/(H*H);
        // System.out.println("Your BMI is : "+BMI);
        //if (BMI<=20){
        //   System.out.println("you are quite slim :)");
        // } else if (BMI<=25) {
        //   System.out.println("you are in normal limits :P");
        // } else if (BMI<=30) {
        //      System.out.println("you are in fat kategory :|");
        // }else System.out.println("you are in obez group :(");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your height in meters");
        double H=input.nextDouble();
        System.out.println("Please enter your weight in kilograms");
        double W=input.nextDouble();
        double BMI=W/(H*H);
        System.out.println("Your BMI is : "+BMI);
        System.out.println(  BMI<=20 ? "you are quite slim :)" : BMI<=25 ? "you are in normal limits :P" : BMI<=30 ? "you are in fat kategory " :"you are in obez group :(");


    }

}

