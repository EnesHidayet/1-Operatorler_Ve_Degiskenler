package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Integer {
    public static void main(String[] args) {
        /**
         * Integer (int): En fazla kullan�lan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir. -2�� ile 2��-1 aras�nda de�erler tan�mlanabilir.
         */
        int max=Integer.MAX_VALUE;
        System.out.println("Integer de�i�ken t�r�n�n alabilidi�i maksimum de�er...:"+max);
        int min=Integer.MIN_VALUE;
        System.out.println("Integer de�i�ken t�r�n�n alabilidi�i minimum de�er...:"+max);

        int s1=5;
        int s2=255;

        int bolum=s2/s1;
        System.out.println("Integer de�i�ken t�r�ndeki say�lar�n b�l�m�...:"+bolum);

    }
}
