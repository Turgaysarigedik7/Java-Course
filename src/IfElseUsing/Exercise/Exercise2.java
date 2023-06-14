package IfElseUsing.Exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yaşınızı giriniz: ");
        int girilenYas = scan.nextInt();
        System.out.println("Cinsiyetiniz :");
        String girilenCinsiyet = scan.next().toLowerCase();

        if(girilenCinsiyet.equals("erkek") && girilenYas>65){
            System.out.println("Emeklisiniz beyefendi");
        }
        else if(girilenCinsiyet.equals("kadin") && girilenYas>55){
            System.out.println("Emeklisiniz hanimefendi");
        }
        else{
            System.out.println("Emekli degilsiniz!");
        }
    }
}
