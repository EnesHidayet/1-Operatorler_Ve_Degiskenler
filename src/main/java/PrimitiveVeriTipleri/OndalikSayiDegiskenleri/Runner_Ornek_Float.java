package PrimitiveVeriTipleri.OndalikSayiDegiskenleri;

public class Runner_Ornek_Float {
    public static void main(String[] args) {

        /**
         * Float: Uzunluðu 32 bittir. Ondalýk sayý türünde -3.4*10³? ile 3.4*10³? arasýnda deðerler alýr.
         */

        float max=Float.MAX_VALUE;
        System.out.println("Float deðiþken türüne atanabilen maksimum deðer...:"+max);
        float min=Float.MIN_VALUE;
        System.out.println("Float deðiþken türüne atanabilen minimum deðer...:"+min);

        float s1=10.25f;
        float s2=18.78f;
        float carpim=s1*s2;

        System.out.println("Float ondalýk sayý deðiþkeninde tanýmlanan iki sayýnýn çarpýmý...:"+carpim);
    }
}
