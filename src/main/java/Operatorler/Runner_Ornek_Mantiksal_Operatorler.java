package Operatorler;

public class Runner_Ornek_Mantiksal_Operatorler {
    public static void main(String[] args) {
        /**
         * && Mant�ksal Operat�r� ko�ullu �ve� anlam�na gelir. Kar��la�t�rmalarda tabi tutulan de�erlerin hepsinin true oldu�u s�rece, true de�er d�nd�r�r.
         * || Mant�ksal Operat�r� ko�ullu �veya� anlam�na gelmektedir. Kar��la�t�rma yap�lan de�erlerden en az biri true oldu�u s�rece true de�er d�nd�r�r.
         */

        boolean dogru=true;
        boolean yanlis=false;

        System.out.println("&& operat�r� kullan�larak bir do�ru bir yanl�� de�erin sonucu...:"+(dogru && yanlis));
        System.out.println("&& operat�r� kullan�larak iki do�ru de�erin sonucu...:"+(dogru && dogru));
        System.out.println("|| operat�r� kullan�larak bir do�ru bir yanl�� de�erin sonucu...:"+(dogru || yanlis));
        System.out.println("|| operat�r� kullan�larak iki do�ru de�erin sonucu...:"+(dogru || dogru));

    }
}
