package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Long {
    public static void main(String[] args) {

        /**
         * Long: Uzunluðu 64 bittir. Tamsayý türünde -2?³ ile 2?³-1 arasýnda deðerler tanýmlanabilir.
         */

        long max=Long.MAX_VALUE;
        System.out.println("Long deðiþken türüne atanabilen maksimum deðer...:"+max);
        long min=Long.MIN_VALUE;
        System.out.println("Long deðiþken türüne atanabilen minumum deðer...:"+min);

        long s1=575;
        long s2=157;
        long carpim=s1*s2;
        System.out.println("Long deðiþken türündeki iki sayýnýn çarpým sonucu...:"+carpim);

    }
}
