package Operatorler;

public class Runner_Ornek_Il�sk�sel_Operatorler {
    public static void main(String[] args) {

        /**
         * �li�kisel operat�rler, de�i�kenler i�erisindeki verilerin aras�nda kar��la�t�rma yapmaya yarar. Bunlar� �u �ekilde s�ralayabiliriz:
         * K���kt�r (<)
         * B�y�kt�r (>)
         * K���k E�ittir (<=)
         * B�y�k E�ittir (>=)
         * E�ittir (==)
         * E�it De�ildir (!=)
         * Yukar�da s�ralanan bu operat�rler iki verinin kar��la�t�rmas�n� yapar. D�nen de�er boolean t�r�ndeki true veya false�dur.
         */

        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 den b�y�k olup olmad���n�n cevab�...:"+(5>2));
        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 den k���k olup olmad���n�n cevab�...:"+(5<2));
        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 den b�y�k veya e�it olup olmad���n�n cevab�...:"+(5>=2));
        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 den k���k veya e�it olup olmad���n�n cevab�...:"+(5<=2));
        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 ye e�it mi sorusunun cevab�...:"+(5==2));
        System.out.println("B�y�kt�r operat�r� kullanarak 5 say�s�n�n 2 ye e�it de�il mi sorusunun cevab�...:"+(5!=2));

    }
}
