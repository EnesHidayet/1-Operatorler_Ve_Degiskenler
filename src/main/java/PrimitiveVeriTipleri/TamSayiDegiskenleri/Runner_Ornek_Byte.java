package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Byte {
    public static void main(String[] args) {

        /**
         * Byte: Bellek �zerinde 1 byte yer kaplar. Tamsay� t�r�nde -128 ile 127 aras�nda de�erler al�r.
         */
        byte max=Byte.MAX_VALUE;
        System.out.println("Byte de�i�keninin alabilidi�i maksimum de�er...:"+max);
        byte min=Byte.MIN_VALUE;
        System.out.println("Byte de�i�keninin alabilidi�i minimum de�er...:"+min);


        byte s1=5;
        byte s2=17;
        byte toplam= (byte) (s1+s2);
        System.out.println("Byte de�i�ken t�r�ndeki say�lar�n toplam�...:"+toplam);

    }
}
