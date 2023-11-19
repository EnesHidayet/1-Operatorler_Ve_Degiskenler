package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Short {
    public static void main(String[] args) {
        /**
         * Short: 16 bittir. Byte tipinde tan�mlanan say�lardan daha b�y�k say�lar tan�mlanabilir. -32768 ile 32767 aras�nda de�erler tan�mlanabilir.
         */

        short max=Short.MAX_VALUE;
        System.out.println("Short de�i�keninin alabilidi�i maksimum de�er...:"+max);
        short min=Short.MIN_VALUE;
        System.out.println("Short de�i�keninin alabilidi�i minimum de�er...:"+min);

        short s1=13512;
        short s2=18438;
        short fark= (short) (s2-s1);
        System.out.println("Short de�i�ken t�r�ndeki say�lar�n fark�...:"+fark);

    }
}
