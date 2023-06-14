package Manuplation;

import java.util.Locale;
import java.util.Scanner;

public class Indexof {
    public static void main(String[] args) {
       /* System.out.println("Email giriniz: ");
        Scanner scan = new Scanner(System.in);
        String mail = scan.next().toLowerCase();
        if(mail.indexOf("@gmail.com")!=-1 || mail.indexOf("@yahoo.com")!=-1){
            System.out.println(mail+ " email gecerli");
        }
        else System.out.println(mail+ " email gecersiz.");*/

        System.out.println("Email giriniz: ");
        Scanner scan = new Scanner(System.in);
        String mail = scan.next().toLowerCase();
        if(mail.indexOf("@")!=-1 ){
            System.out.println(mail+ " email gecerli");
        }
        else System.out.println(mail+ " email gecersiz.");
    }
}
