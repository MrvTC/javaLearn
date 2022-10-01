package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task10 {
// Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

    // c = (f-32)*5/9

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Fahrenheit değeri giriniz: ");
int fh=input.nextInt();

        System.out.println("Celcius değeri: "+((fh-32)*5/9));



    }




}
