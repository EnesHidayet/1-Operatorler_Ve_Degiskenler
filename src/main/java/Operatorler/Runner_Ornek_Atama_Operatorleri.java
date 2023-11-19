package Operatorler;

public class Runner_Ornek_Atama_Operatorleri {
    public static void main(String[] args) {

        /**
         * = Operatörü: Herkesin muhakkak kullandýðý temel bir atama operatörüdür. Atama iþlemleri her zaman saðdan sola bir þekilde gerçekleþtirilir.
         * += Operatörü: Solda bulunan deðere, kendi deðerini ekleyerek tekrar soldaki deðere atamasýný gerçekleþtirir.
         * -= Operatörü: Solda atanan deðerden, saðdaki deðeri çýkararak tekrar solda yer alan deðere atama gerçekleþtirir.
         * *= Operatörü: Soldaki deðeri, saðda yer alan deðer ile çarparak tekrar soldaki deðere atamasýný gerçekleþtirir.
         * /= Operatörü: Diðer operatörlerde olduðu gibi soldaki deðeri, saðdaki deðere bölerek sonucu tekrar soldaki deðere atar.
         *
         */

        int sayi=150;
        System.out.println("Sayýmýz...:"+sayi);
        sayi+=5;
        System.out.println("= operatörü ile atama gerçekleþtirdiðimiz int deðeri += yaparak 5 ekleyeceðiz...:"+(sayi));
        sayi=150;
        sayi-=5;
        System.out.println("= operatörü ile atama gerçekleþtirdiðimiz int deðeri -= yaparak 5 azaltacaðýz...:"+(sayi));
        sayi=150;
        sayi*=5;
        System.out.println("= operatörü ile atama gerçekleþtirdiðimiz int deðeri *= yaparak 5 çarpacaðýz...:"+(sayi));
        sayi=150;
        sayi/=5;
        System.out.println("= operatörü ile atama gerçekleþtirdiðimiz int deðeri /= yaparak 5 böleceðiz...:"+(sayi));

    }
}
