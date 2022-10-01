package Days;

public class Q03_StringManipulation {
    public static void main(String[] args) {


        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.//kelimeyi sayıya dönüştür metodu

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        String  str1= "$13.99";
        str1=str1.replaceAll("\\D","");//1399
        String str2= "$10.55";
str2=str2.replaceAll("\\D","");//1055

        System.out.println("str1+str2 = " + str1 + str2);//

        //* str1 ve str2 içeriği sayı olan string ifadelerdir.
        //eğer içeriğinin tamamen sayı olduğunu bildiğimiz string varsa
        //parseDouble ve ya parseInteger metodu kullanabiliriz.

        double sayi1=Double.parseDouble(str1);//string olan str1 sayı olan sayi1 e dönüştü
        double sayi2=Double.parseDouble(str2);//string olan str2 sayı olan sayi2 e dönüştü

        System.out.println("sayi2 + sayi1 = " + sayi2 + sayi1);


    }
}
