package PrimitiveVeriTipleri.OndalikSayiDegiskenleri;

public class Runner_Ornek_Double {
    public static void main(String[] args) {

        /**
         * Double: Uzunluðu 64 bittir. Ondalýk sayý türünde -1.7*10³?? ile 1.7*10³?? arasýnda deðerler alýr.
         */

        double max=Double.MAX_VALUE;
        System.out.println("Double deðiþken türüne tanýmlanabilen maksimum deðer...:"+max);
        double min=Double.MIN_VALUE;
        System.out.println("Double deðiþken türüne tanýmlanabilen minimum deðer...:"+min);

        double s1=100.185;
        double s2=150.75;
        double bolum=s2/s1;

        System.out.println("Double deðiþken türü kullanýlarak oluþturulan iki sayýnýn bölümü...:"+bolum);
    }
}
