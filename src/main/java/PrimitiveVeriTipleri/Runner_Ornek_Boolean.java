package PrimitiveVeriTipleri;

import java.util.Scanner;

public class Runner_Ornek_Boolean {
    public static void main(String[] args) {

        /**
         * Boolean: Di�er de�i�kenlerden daha farkl� olarak sadece 2 de�er al�r. Bu de�erler true veya false�dir.
         * Bellekte bir bit yer kaplar. Mant�ksal tipler olarak da bilinir.
         */

        int s1=2;
        int s2=2;
        int toplam;
        boolean check;
        System.out.println("L�tfen "+s1+" + "+s2+" toplam�n� yaz�n�z...");
        int cevap= new Scanner(System.in).nextInt();

        if (cevap==4){
            check=true;
        }else check=false;

        System.out.println("Cevab�n�z "+check);

    }
}
