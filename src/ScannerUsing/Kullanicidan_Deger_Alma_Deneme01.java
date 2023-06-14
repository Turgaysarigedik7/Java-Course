package ScannerUsing;

import java.util.Scanner;

public class Kullanicidan_Deger_Alma_Deneme01 {
    public static void main(String[] args) {
        System.out.println("Yaşınızı Giriniz: "); //Kullanıcının yaşını girmesini istedik
        Scanner scan = new Scanner(System.in); //Kullanıcının yaşını alabilmek için bir Scanner tanımladık.
        int girilenYas = scan.nextInt(); //Kullanıcın girdiği yaş değerini girilenYas isimli değişekene atadık
        System.out.println("Girilen Yaş: "+girilenYas); //Console ekranımıza girilenYas isimli değişkene atadığımız değeri yazdırdık
    }
}
