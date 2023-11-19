package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Integer {
    public static void main(String[] args) {
        /**
         * Integer (int): En fazla kullanýlan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir. -2³¹ ile 2³¹-1 arasýnda deðerler tanýmlanabilir.
         */
        int max=Integer.MAX_VALUE;
        System.out.println("Integer deðiþken türünün alabilidiði maksimum deðer...:"+max);
        int min=Integer.MIN_VALUE;
        System.out.println("Integer deðiþken türünün alabilidiði minimum deðer...:"+max);

        int s1=5;
        int s2=255;

        int bolum=s2/s1;
        System.out.println("Integer deðiþken türündeki sayýlarýn bölümü...:"+bolum);

    }
}
