package j10_StringManipulations.tasks;

public class task08 {
    public static void main(String[] args) {
/*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String isim="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char m=isim.charAt(isim.indexOf("M"));
        char e= isim.charAt(isim.indexOf("E"));
        char r= isim.charAt(isim.indexOf("R"));
        char v= isim.charAt(isim.indexOf("V"));
        System.out.println(""+m+e+r+v+e);


    }
}
