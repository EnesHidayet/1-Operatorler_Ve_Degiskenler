package PrimitiveVeriTipleri.OndalikSayiDegiskenleri;

public class Runner_Ornek_Float {
    public static void main(String[] args) {

        /**
         * Float: Uzunlu�u 32 bittir. Ondal�k say� t�r�nde -3.4*10�? ile 3.4*10�? aras�nda de�erler al�r.
         */

        float max=Float.MAX_VALUE;
        System.out.println("Float de�i�ken t�r�ne atanabilen maksimum de�er...:"+max);
        float min=Float.MIN_VALUE;
        System.out.println("Float de�i�ken t�r�ne atanabilen minimum de�er...:"+min);

        float s1=10.25f;
        float s2=18.78f;
        float carpim=s1*s2;

        System.out.println("Float ondal�k say� de�i�keninde tan�mlanan iki say�n�n �arp�m�...:"+carpim);
    }
}
