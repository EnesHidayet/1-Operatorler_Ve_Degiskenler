package ReferansVeriTipleri;

public class Runner_Ornek_String {
    public static void main(String[] args) {

        /**
         * String deðiþkeni referans tipli bir deðiþkendir ve kendi bellek yönetimi vardýr.Bu türü bellek alanýnýn hem
         * stack hemde heap alanýný kullanýr bu nedenle sabit bit geniþliði yoktu içerisine eklenen deðerle büyümektedir.
         * String, referans tipindedir. String veri tipi için, char’larýn birleþmesinden meydana gelmiþ tanýmý yapabilirim. Çift týrnak içerisinde tanýmlama yapýlýr.
         */

        String ifade="Enes ASLAN";

        System.out.println(ifade+" string olarak atanan bu ifadenin 3. indexindeki harfi metod kullanarak bulduk...:"+ifade.charAt(2));

    }
}
