package PrimitiveVeriTipleri;

import java.util.Scanner;

public class Runner_Ornek_Boolean {
    public static void main(String[] args) {

        /**
         * Boolean: Diðer deðiþkenlerden daha farklý olarak sadece 2 deðer alýr. Bu deðerler true veya false’dir.
         * Bellekte bir bit yer kaplar. Mantýksal tipler olarak da bilinir.
         */

        int s1=2;
        int s2=2;
        int toplam;
        boolean check;
        System.out.println("Lütfen "+s1+" + "+s2+" toplamýný yazýnýz...");
        int cevap= new Scanner(System.in).nextInt();

        if (cevap==4){
            check=true;
        }else check=false;

        System.out.println("Cevabýnýz "+check);

    }
}
