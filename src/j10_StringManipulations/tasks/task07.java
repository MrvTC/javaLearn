package j10_StringManipulations.tasks;

import java.util.Scanner;

public class task07 {

    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.print("bir metin giriniz : ");
        String str=input.nextLine();
        System.out.println("istenen karakterin indexini giriniz");
        int index=input.nextInt();
        if (str.length()>index) {
            System.out.println(str.substring(index, index + 1));//str.charAt(index) böyle de olur
        }else System.out.println("girdiğiniz metinde olmayan index istiyorsunuz");




        }








    }

