package PrimitiveVeriTipleri.TamSayiDegiskenleri;

public class Runner_Ornek_Short {
    public static void main(String[] args) {
        /**
         * Short: 16 bittir. Byte tipinde tanýmlanan sayýlardan daha büyük sayýlar tanýmlanabilir. -32768 ile 32767 arasýnda deðerler tanýmlanabilir.
         */

        short max=Short.MAX_VALUE;
        System.out.println("Short deðiþkeninin alabilidiði maksimum deðer...:"+max);
        short min=Short.MIN_VALUE;
        System.out.println("Short deðiþkeninin alabilidiði minimum deðer...:"+min);

        short s1=13512;
        short s2=18438;
        short fark= (short) (s2-s1);
        System.out.println("Short deðiþken türündeki sayýlarýn farký...:"+fark);

    }
}
