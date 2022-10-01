package j10_StringManipulations;

import javax.swing.*;
import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String sehir="istanbul";
        System.out.println(sehir.startsWith("i"));
        System.out.println(sehir.startsWith("is"));
        System.out.println(sehir.startsWith("s"));
        System.out.println(sehir.startsWith("a",3));//true a karakteri 3. indexte mi bulunuyor

        String str="bul";
        System.out.println(sehir.endsWith(str));//true


}
    }