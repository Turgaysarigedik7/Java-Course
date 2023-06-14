package IfElseUsing.Exercise;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı gir: ");
        int girilenSayi = scan.nextInt();

        if(girilenSayi%2==0){
            System.out.println(girilenSayi+" sayisi cifttir");
        }
        else if(girilenSayi%2!=0){
            System.out.println(girilenSayi+" sayisi tektir");
        }
        else {
            System.out.println("Sistem hatası");
        }
    }
}
