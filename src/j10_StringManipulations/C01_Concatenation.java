package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        // concat methodu içine (parametre) aldığı strşng variable ı çalıştığı stringin sonuna ekler.
        //javada + işlemi yapılırken eğer en az bir string variable varsa java toplam değil concat yapar.
         //


        String name="merve";
        String meslek= "QA tester";
        System.out.println(name.concat(meslek));
        System.out.println(name);
        /**string metodları variable geçici değişiklik yapar.
         * ama değişken atama yapılrsa kalıcı değişir.
         */
name=meslek.concat(name);
        System.out.println("name = " + name);

        System.out.println(name.concat(true+" :) "));//QA tester nurtrue
        System.out.println(name.concat(100+" :) "));//qa tester nur100

//concat metodu parametre olark string type harici tüm dataları stringe çevirip concat eder.








    }
}


