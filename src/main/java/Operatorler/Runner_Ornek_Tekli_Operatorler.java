package Operatorler;

public class Runner_Ornek_Tekli_Operatorler {
    public static void main(String[] args) {

        /**
         * Operat�rler i�lemleri ger�ekle�tirebilmek i�in ihtiya� duydu�u de�i�kenlere operand denilmektedir.
         * Tek operand� bulunan operat�rlere ise tekli (unary) operat�r denir.
         * Tekli - veya + konulmas�, ilgili operand�n de�erini negatif veya pozitif yapmak i�in kullan�l�r.
         * Artt�rma Operat�r� ve Azaltma Operat�r� (++ / --) operand�n de�erini bir artt�r�r veya azalt�r.
         * Sonras�nda Art�� veya Azaltma (a++ / a--) operand �nce hesaplan�r sonra artt�r�l�r.
         * �n Artt�rma veya Azaltma(++a / --a) operand �nce artt�r�l�r veya azalt�l�r sonra hesaplamas� ger�ekle�tirilir.
         * De�il Operat�r� (!) boole de�erlerini ters �evirmek i�in kullan�l�r.
         */

        int a=5;
        boolean dogru=true;
        System.out.println("Say�m�z...:"+a);
        System.out.println("- operat�r� ile say�m�z� negatif yapt�k...:"+(-a));
        System.out.println("++ operat�r� ile say�m�z� artt�rd�k..."+a++);
        System.out.println("-- operat�r� ile say�m�z� azaltt�k..."+a++);
        System.out.println("! operat�r� ile boolean true de�erimizi tersine �evirdik...:"+!dogru);

    }
}
