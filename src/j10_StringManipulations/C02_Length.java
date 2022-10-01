package j10_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        /**length()methodu girilen stringin uzunluğunu: içinde buluna karakter
         * sayısını return eder
         * bütü kRkterleri(boşluk vs.) sayıp adedeni return eder.
         *
         */
        String str = "madem geldin dünyaya otur çalış javaya :)";
        int strKrktrSayisi = str.length();// int type bir data verir.
        System.out.println(str);
        System.out.println(strKrktrSayisi);
        String str1 = "";
        System.out.println(str1.length());//0
        String str2 = " ";
        System.out.println(str2.length());//1
        //String str3=null;// run time error
        // System.out.println(str3.length());//

        /**null case sensitive dir. yani null yazılamaz
         * null bir değer değildir. sadece hiçliği  gösteren bir pointer dır.
         */
        String str3=null;
str.concat(str1);//run time error













    }
}
