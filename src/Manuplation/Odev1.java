package Manuplation;

import java.util.Scanner;

public class Odev1 {
    public static void main(String[] args) {
        // Odev :)
        // Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //		- Girilen kelime cumlede kullanilmamis.
        //		- Girilen kelime cumlede 1 kere kullanilmis.
        //		- Girilen kelime cumlede 1’den fazla kullanilmis.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle giriniz: ");
        String cumle = scan.nextLine();
        System.out.println("Bir kelime giriniz: ");
        String kelime = scan.next();


       if (cumle.indexOf(kelime)==-1){
            System.out.println("Girilen "+kelime+" kelimesi cumlede kullanilmamistir");
        }
        else if (cumle.indexOf(kelime,cumle.indexOf(kelime)+1)==-1){
            System.out.println("Girilen "+kelime+" kelimesi cumlede bir kez kullanilmistir");
        }

        else if (cumle.indexOf(kelime,cumle.indexOf(kelime)+1)!=-1) {
            System.out.println(kelime + " kelimesi cumlede birden fazla kez kullanislmistir.");
        }


    }
}
