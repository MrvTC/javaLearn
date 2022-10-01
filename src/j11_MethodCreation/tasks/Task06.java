package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/*
		 Kullanıcıya  dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("Which do you want to choose: Rectangle or triangle");
        String choice = input.nextLine().toLowerCase();

        if (choice.contains("rectangle") || choice.contains("triangle")) {

            System.out.println("Enter two number, please");
            int number = input.nextInt();
            int number1 = input.nextInt();

            switch (choice) {
                case "rectangle":
                    rectangleCalculate(number, number1);
                    break;
                case "triangle":
                    perimeterCalculate(number, number1);
                    break;
                default:
                    System.out.println("Wrong choice");

            }


        } else System.out.println("You made the wrong choice");

    }

    private static void perimeterCalculate(int number, int number1) {
        int areaCalculate = (number * number1) / 2;

        double perimeter= Math.sqrt(number * number + number1 * number1) + number + number1;

        System.out.println("area: " + areaCalculate + "\nperimeter:" + perimeter);

    }

    private static void rectangleCalculate(int number, int number1) {

        int areaCalculate = number * number1;

        int perimeter = (number + number1) * 2;

        System.out.println("area: " + areaCalculate + "\nperimeter: " + perimeter);


    }

}

