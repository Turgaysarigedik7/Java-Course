package Manuplation;

import java.util.Scanner;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        System.out.println("Islem yapmaya devam etmek istiyor musunuz? ");
        Scanner scan = new Scanner(System.in);
        String cevap = scan.next();

        if(cevap.equalsIgnoreCase("evet"))
            System.out.println(cevap.toLowerCase()+ " devam etme isteginiz onaylanmistir.");
        else if (cevap.equalsIgnoreCase("hayir"))
            System.out.println(cevap.toLowerCase()+ " devam etme isteginiz onaylanmamistir.");
        else
            System.out.println("Hatali giris");




    }
}
