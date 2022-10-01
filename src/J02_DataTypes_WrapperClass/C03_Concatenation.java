package J02_DataTypes_WrapperClass;

public class C03_Concatenation {

    public static void main(String[] args) {
        String ad= "Haluk";
        String soyad="Bilgin";

        int a=7;
        int b=11;
        /*birden çok string variable ile farlı data variable'lar + ile işleme alınırsa
         java birleştirme yaparak yeni bir string oluşturur.
         TRICK: bir aritmetik işlem içinde string kullanılırsa artimetik işlem önceliğine göre işlem yapılıp string
        variable'a concatenation yapılır.
         */


        System.out.println(ad+soyad+a+b);//halukbilgin711
        System.out.println(a+ad+soyad+b);//7halukbilgin11
        System.out.println(a+b+ad+soyad);//18halukbilgin
        System.out.println(" "+a+b);//...711
        System.out.println(ad+soyad+(a+b));//halukbilgin18
        System.out.println((a+b)+ad+soyad);//18halukbilgin
        System.out.println(ad+(a-b)+(a-b));//haluk-4-4
        System.out.println(ad+((a-b)+(a-b)));//haluk-8

       char ch= '1';
        System.out.println(ad+ch);//haluk1
        System.out.println(a+ch+ad);//7+49= 56haluk  49* 1'in ASCII değeridir.
        System.out.println(ad+(ch+b));//haluk60   ch=49 b=11 toplarsan 60
        System.out.println(a+ad+ch);//7haluk1

        /* TRICK: char data turu işleme girdiği variables in türüne göre farklı işlem yapar eğer işleme girdiği variables
        aritmetik bir işlemse ascii değeri ile işlem yapar.

         */
        byte mat= 26;
        byte trukce=18;
        System.out.println("not ortalaması:"+((mat+trukce)/2));
        short jk=54;
        byte fk=55;
        System.out.println(jk+fk);
        System.out.println(jk-fk);
         byte hjk=87;
         float lo=88.55f;
        System.out.println(hjk+lo);
        System.out.println(hjk-lo);

        int kl= 50;
        char kk='$';
        System.out.println(kl+kk);

        String adim= "Merve", Soyadim= "TC", Yasim= "28";
        System.out.println(adim);
        System.out.println(Soyadim);
        System.out.println(Yasim);
    }
}
