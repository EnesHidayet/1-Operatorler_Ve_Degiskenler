package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Long {
    public static void main(String[] args) {

        /**
         * Long: Uzunlu�u 64 bittir. Tamsay� t�r�nde -2?� ile 2?�-1 aras�nda de�erler tan�mlanabilir.
         */

        long max=Long.MAX_VALUE;
        System.out.println("Long de�i�ken t�r�ne atanabilen maksimum de�er...:"+max);
        long min=Long.MIN_VALUE;
        System.out.println("Long de�i�ken t�r�ne atanabilen minumum de�er...:"+min);

        long s1=575;
        long s2=157;
        long carpim=s1*s2;
        System.out.println("Long de�i�ken t�r�ndeki iki say�n�n �arp�m sonucu...:"+carpim);

    }
}
