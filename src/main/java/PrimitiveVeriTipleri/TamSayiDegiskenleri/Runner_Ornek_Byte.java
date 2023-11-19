package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Byte {
    public static void main(String[] args) {

        /**
         * Byte: Bellek üzerinde 1 byte yer kaplar. Tamsayý türünde -128 ile 127 arasýnda deðerler alýr.
         */
        byte max=Byte.MAX_VALUE;
        System.out.println("Byte deðiþkeninin alabilidiði maksimum deðer...:"+max);
        byte min=Byte.MIN_VALUE;
        System.out.println("Byte deðiþkeninin alabilidiði minimum deðer...:"+min);


        byte s1=5;
        byte s2=17;
        byte toplam= (byte) (s1+s2);
        System.out.println("Byte deðiþken türündeki sayýlarýn toplamý...:"+toplam);

    }
}
