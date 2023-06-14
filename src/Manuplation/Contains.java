package Manuplation;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir email giriniz: ");
        String email = scan.nextLine();

        if (email.contains("@gmail.com")==false)
            System.out.println("Lutfen dogru bir @gmail.com hesabi giriniz.");
        else if(email.contains("@gmail.com")==true)
            System.out.println("Girilen email adresi basariyla kaydedilmistir.");
        else System.out.println("Lutfen emailinizi kontrol edin.");
    }
}
