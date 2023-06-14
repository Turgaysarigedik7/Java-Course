package ScannerUsing;

import java.util.Scanner;

public class Coklu_Scanner_Kullanimi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Kullanıcıdan İsim ve soyad alabilmek için bir Scanner tanımladık.
        System.out.println("Kullanıcı Adı: "); //Kullanıcının adını girmesini istedik
        String kullaniciAdi = scan.next(); //Girilen kullanıcı adını kullaniciAdi isimli değişkene atadık.
        System.out.println("Kullanıcı Soyadı: "); //Kullanıcının soyadını girmesini istedik
        String kullaniciSoyadi = scan.next(); //Girilen kullanıcı soyadını kullaniciSoyadı isimli bir değişkene atadık.
        System.out.println("Kullanıcı Adı:"+" "+kullaniciAdi+" "+"Kullanıcı Soyadı:"+" "+kullaniciSoyadi); //Console ekranına kullanıcıAdi ve KullanıcıSoyadi değikenlerine atadığımız değerleri yazdırıyoruz.

    }
}
