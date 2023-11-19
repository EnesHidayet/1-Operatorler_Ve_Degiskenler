package Operatorler;

public class Runner_Ornek_Mantiksal_Operatorler {
    public static void main(String[] args) {
        /**
         * && Mantýksal Operatörü koþullu “ve” anlamýna gelir. Karþýlaþtýrmalarda tabi tutulan deðerlerin hepsinin true olduðu sürece, true deðer döndürür.
         * || Mantýksal Operatörü koþullu “veya” anlamýna gelmektedir. Karþýlaþtýrma yapýlan deðerlerden en az biri true olduðu sürece true deðer döndürür.
         */

        boolean dogru=true;
        boolean yanlis=false;

        System.out.println("&& operatörü kullanýlarak bir doðru bir yanlýþ deðerin sonucu...:"+(dogru && yanlis));
        System.out.println("&& operatörü kullanýlarak iki doðru deðerin sonucu...:"+(dogru && dogru));
        System.out.println("|| operatörü kullanýlarak bir doðru bir yanlýþ deðerin sonucu...:"+(dogru || yanlis));
        System.out.println("|| operatörü kullanýlarak iki doðru deðerin sonucu...:"+(dogru || dogru));

    }
}
