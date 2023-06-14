package IfElseUsing.Exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        // sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        if (sayi1>0 && sayi2>0){
            System.out.println("girdiginiz iki sayi da pozitif oldugundan toplamlari= " +
                    (sayi1+sayi2));
        } else if (sayi1<0 && sayi2<0){
            // sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
            System.out.println("girdiginiz iki sayi da negatif oldugundan carpimmlari= " +
                    (sayi1*sayi2));
        } else if (sayi1*sayi2<0){
            // sayilarin ikisi farkli isaretlere sahipse
            // “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        } else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
