package PrimitiveVeriTipleri.OndalikSayiDegiskenleri;

public class Runner_Ornek_Double {
    public static void main(String[] args) {

        /**
         * Double: Uzunlu�u 64 bittir. Ondal�k say� t�r�nde -1.7*10�?? ile 1.7*10�?? aras�nda de�erler al�r.
         */

        double max=Double.MAX_VALUE;
        System.out.println("Double de�i�ken t�r�ne tan�mlanabilen maksimum de�er...:"+max);
        double min=Double.MIN_VALUE;
        System.out.println("Double de�i�ken t�r�ne tan�mlanabilen minimum de�er...:"+min);

        double s1=100.185;
        double s2=150.75;
        double bolum=s2/s1;

        System.out.println("Double de�i�ken t�r� kullan�larak olu�turulan iki say�n�n b�l�m�...:"+bolum);
    }
}
