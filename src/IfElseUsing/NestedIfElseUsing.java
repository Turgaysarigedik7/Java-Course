package IfElseUsing;

import java.util.Scanner;

public class NestedIfElseUsing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //nested if else kullanimi
        System.out.println("cinsiyet giriniz");
        String cinsiyet2 = scan.next();
        System.out.println("yas giriniz");
        int yas2 = scan.nextInt();


        if (cinsiyet2.equals("erkek")) {
            if (yas2 > 65) {
                System.out.println("emekli bir beyefendisiniz");
            } else System.out.println("emekli bir beyefendi degilsiniz");
        } else if (cinsiyet2.equals("kadin")) {
            if (yas2 > 55) {
                System.out.println("emekli bir hanimefendisiniz");
            } else System.out.println("emekli bir hanimefendi degilsiniz degilsiniz");
        } else System.out.println("yanlis bir cinsiyet girdiniz");
    }
}
