package J02_DataTypes_WrapperClass;

import java.sql.SQLOutput;

public class Homework1 {
    /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */


    public static void main(String[] args) {
        //  Soru-1 :   konsola      "Hello ", "World  \ /" seklinde yazdırınız
        // Cevap-1 :

        System.out.println("\"Hello\", \"World  \\ / \"");

        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.

        System.out.println("p\na\nz\na\nr\nt\ne\ns\ni");

        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız
        //cevap-3:

        System.out.println("\"Java\" ile hayat çok 'afilli'");

        //Soru-4 : "Basari" gayrete
        // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.
        //cevap-4:

        System.out.println("\"Başarı\" gayrete\n'aşıktır'\n\n\n\t\"Clarusway ile java çook kolay :)\" ");

    }

}
