package ScannerUsing;

import java.util.Scanner;

public class Coklu_Scanner_Odev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adınız: ");
        String kullaniciAd = scan.next();

        System.out.println("Soyad: ");
        String kullaniciSoyad = scan.next();

        System.out.println("Yaş: ");
        int kullaniciYas = scan.nextInt();


        //-------Cinsiyet kısmında kullandığım charAt() işlemedik onu görmezden gelebilirsiniz-------
        System.out.println("Cinsiyet (E/K): ");
        char kullaniciCinsiyet = scan.next().charAt(0);
        //-----------------------------------------------

        System.out.println("Adın:"+" "+kullaniciAd+" "+"Soyadın:"+" "+kullaniciSoyad+
                " "+"Yaşın:"+" "+kullaniciYas+" "+"Cinsiyetin:"+" "+kullaniciCinsiyet);

    }
}
