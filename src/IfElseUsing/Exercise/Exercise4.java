package IfElseUsing.Exercise;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        //int verilenSayi = 66;
        //Gorev: kullanicidan bir tam sayi girmesini isteyin, girilen bu sayinin tek mi çift mi olduğuna karar verin ve sonucu consolda yazdırın.
        // verilenSayi%2 == 0        verilenSayi%2 != 0

        //kullanıcıdan yasini ve cinsiyetini girmesini isteyin, eğer erkekse ve yaşı 65 in üzerindeyse emeklidir sonucunu consola bastıralım,
        //kadın ve 55 den yukarıda ise  emeklidir sonucu consolda bastiralim.

        Scanner scan =  new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz...");
        int verilenSayi=scan.nextInt();


        if (verilenSayi%2==0){
            System.out.println("verilen sayi cifttir!");

        }
        else {
            System.out.println("verilen sayi tektir");

        }

        System.out.println("Lutfen yasinisinizi giriniz");
        int yas = scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet= scan.next();



        if (cinsiyet.equals("erkek") && yas > 65){
            System.out.println("Emekli bir beyefendisiniz.");
        }
        else if (cinsiyet.equals("kadin") && yas > 55){
            System.out.println("Emekli bir hanimefendinisiniz.");
        }
        else if (!(cinsiyet.equals("erkek")) && !(cinsiyet.equals("kadin"))){
            System.out.println("yanlis bir cinsiyet girdiniz");
        }
        else System.out.println("emekli degilsiniz...");
    }
}
