package Operatorler;

public class Runner_Ornek_Ilýskýsel_Operatorler {
    public static void main(String[] args) {

        /**
         * Ýliþkisel operatörler, deðiþkenler içerisindeki verilerin arasýnda karþýlaþtýrma yapmaya yarar. Bunlarý þu þekilde sýralayabiliriz:
         * Küçüktür (<)
         * Büyüktür (>)
         * Küçük Eþittir (<=)
         * Büyük Eþittir (>=)
         * Eþittir (==)
         * Eþit Deðildir (!=)
         * Yukarýda sýralanan bu operatörler iki verinin karþýlaþtýrmasýný yapar. Dönen deðer boolean türündeki true veya false‘dur.
         */

        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 den büyük olup olmadýðýnýn cevabý...:"+(5>2));
        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 den küçük olup olmadýðýnýn cevabý...:"+(5<2));
        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 den büyük veya eþit olup olmadýðýnýn cevabý...:"+(5>=2));
        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 den küçük veya eþit olup olmadýðýnýn cevabý...:"+(5<=2));
        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 ye eþit mi sorusunun cevabý...:"+(5==2));
        System.out.println("Büyüktür operatörü kullanarak 5 sayýsýnýn 2 ye eþit deðil mi sorusunun cevabý...:"+(5!=2));

    }
}
