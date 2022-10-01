package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        //*string içinde istenen stringin varlığını kontrol eder. boolean return eder.
        String s1="merve hanım başarılı bir QA tester team lead";
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("e"));
        System.out.println(s1.contains(" "));//true

        String s2="QA";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false






    }
}
