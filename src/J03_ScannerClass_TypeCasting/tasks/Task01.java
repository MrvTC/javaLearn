package J03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */

        Scanner input= new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz:");
        int midTerm= input.nextInt();
        System.out.println("Final notunuzu giriniz:");
        int Final= input.nextInt();
        System.out.println("Proje notunuzu giriniz: ");
        int project= input.nextInt();
        double grate= midTerm*0.30+Final*0.50+project*0.20;
        System.out.println("Not ort: " + grate);
    }
}
