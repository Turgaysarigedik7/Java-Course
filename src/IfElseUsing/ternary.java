package IfElseUsing;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println((sayi>=0) ? sayi+" sayisi pozitif": sayi+" sayisi negatif");


    }
}
