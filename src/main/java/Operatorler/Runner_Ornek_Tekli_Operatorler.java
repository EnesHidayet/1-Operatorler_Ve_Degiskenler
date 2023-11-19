package Operatorler;

public class Runner_Ornek_Tekli_Operatorler {
    public static void main(String[] args) {

        /**
         * Operatörler iþlemleri gerçekleþtirebilmek için ihtiyaç duyduðu deðiþkenlere operand denilmektedir.
         * Tek operandý bulunan operatörlere ise tekli (unary) operatör denir.
         * Tekli - veya + konulmasý, ilgili operandýn deðerini negatif veya pozitif yapmak için kullanýlýr.
         * Arttýrma Operatörü ve Azaltma Operatörü (++ / --) operandýn deðerini bir arttýrýr veya azaltýr.
         * Sonrasýnda Artýþ veya Azaltma (a++ / a--) operand önce hesaplanýr sonra arttýrýlýr.
         * Ön Arttýrma veya Azaltma(++a / --a) operand önce arttýrýlýr veya azaltýlýr sonra hesaplamasý gerçekleþtirilir.
         * Deðil Operatörü (!) boole deðerlerini ters çevirmek için kullanýlýr.
         */

        int a=5;
        boolean dogru=true;
        System.out.println("Sayýmýz...:"+a);
        System.out.println("- operatörü ile sayýmýzý negatif yaptýk...:"+(-a));
        System.out.println("++ operatörü ile sayýmýzý arttýrdýk..."+a++);
        System.out.println("-- operatörü ile sayýmýzý azalttýk..."+a++);
        System.out.println("! operatörü ile boolean true deðerimizi tersine çevirdik...:"+!dogru);

    }
}
