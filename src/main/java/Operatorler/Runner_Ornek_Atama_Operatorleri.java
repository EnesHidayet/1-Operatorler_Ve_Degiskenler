package Operatorler;

public class Runner_Ornek_Atama_Operatorleri {
    public static void main(String[] args) {

        /**
         * = Operat�r�: Herkesin muhakkak kulland��� temel bir atama operat�r�d�r. Atama i�lemleri her zaman sa�dan sola bir �ekilde ger�ekle�tirilir.
         * += Operat�r�: Solda bulunan de�ere, kendi de�erini ekleyerek tekrar soldaki de�ere atamas�n� ger�ekle�tirir.
         * -= Operat�r�: Solda atanan de�erden, sa�daki de�eri ��kararak tekrar solda yer alan de�ere atama ger�ekle�tirir.
         * *= Operat�r�: Soldaki de�eri, sa�da yer alan de�er ile �arparak tekrar soldaki de�ere atamas�n� ger�ekle�tirir.
         * /= Operat�r�: Di�er operat�rlerde oldu�u gibi soldaki de�eri, sa�daki de�ere b�lerek sonucu tekrar soldaki de�ere atar.
         *
         */

        int sayi=150;
        System.out.println("Say�m�z...:"+sayi);
        sayi+=5;
        System.out.println("= operat�r� ile atama ger�ekle�tirdi�imiz int de�eri += yaparak 5 ekleyece�iz...:"+(sayi));
        sayi=150;
        sayi-=5;
        System.out.println("= operat�r� ile atama ger�ekle�tirdi�imiz int de�eri -= yaparak 5 azaltaca��z...:"+(sayi));
        sayi=150;
        sayi*=5;
        System.out.println("= operat�r� ile atama ger�ekle�tirdi�imiz int de�eri *= yaparak 5 �arpaca��z...:"+(sayi));
        sayi=150;
        sayi/=5;
        System.out.println("= operat�r� ile atama ger�ekle�tirdi�imiz int de�eri /= yaparak 5 b�lece�iz...:"+(sayi));

    }
}
