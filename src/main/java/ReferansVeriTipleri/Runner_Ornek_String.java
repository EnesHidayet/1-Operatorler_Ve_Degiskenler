package ReferansVeriTipleri;

public class Runner_Ornek_String {
    public static void main(String[] args) {

        /**
         * String de�i�keni referans tipli bir de�i�kendir ve kendi bellek y�netimi vard�r.Bu t�r� bellek alan�n�n hem
         * stack hemde heap alan�n� kullan�r bu nedenle sabit bit geni�li�i yoktu i�erisine eklenen de�erle b�y�mektedir.
         * String, referans tipindedir. String veri tipi i�in, char�lar�n birle�mesinden meydana gelmi� tan�m� yapabilirim. �ift t�rnak i�erisinde tan�mlama yap�l�r.
         */

        String ifade="Enes ASLAN";

        System.out.println(ifade+" string olarak atanan bu ifadenin 3. indexindeki harfi metod kullanarak bulduk...:"+ifade.charAt(2));

    }
}
