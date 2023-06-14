package Manuplation;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
       /* String name  = "Turgay Sefa Sarigedik";
        System.out.println("Name: "+name.substring(0,6));
        System.out.println("Full Name: "+name.substring(7,11));
        System.out.println("Last Name: "+name.substring(12));

        */
        Scanner scan = new Scanner(System.in);
/*
        System.out.println("galon litre icin \"galon\" yaziniz, litre galon icin \"litre\" yaziniz...");
        String hacimCesidi = scan.next().toLowerCase();
        System.out.println("Lutfen hacim degeri giriniz...");
        double hacimDegeri = scan.nextInt();
         if (hacimCesidi.equals("galon") || hacimCesidi.equals("litre")){
             if (hacimDegeri>0){
                 if (hacimCesidi.equals("galon")){
                     System.out.println("girilen "+hacimDegeri+" galonun litre karsiligi: "+(hacimDegeri*3.78)+" litredir.");
                 }
                 else if (hacimCesidi.equals("litre")){
                     System.out.println("girilen "+hacimDegeri+" litrenin galon karsiligi: "+(hacimDegeri/3.78)+" galondur.");
                 }

             }
             else System.out.println("Lutfen gecerli bir hacim degeri giriniz...");
         }
         else System.out.println("Lutfen gecerli bir hacim cesidi giriniz...");


 */
/*
        System.out.println("Fahrenheit icin \"f\" yaziniz, Celsius icin \"c\" yaziniz...");
        String dereceCesidi = scan.next();

        if (dereceCesidi.equals("f") || dereceCesidi.equals("c")){

            System.out.println("Lutfen derece degeri giriniz...");
            double dereceDegeri = scan.nextInt();
                if (dereceCesidi.equals("f")){
                    System.out.println("girilen "+dereceDegeri+" Fahrenheit Celsius karsiligi: "+((dereceDegeri-32)/1.8)+" Celsius dur.");
                }
                else if (dereceCesidi.equals("c")){
                    System.out.println("girilen "+dereceDegeri+" Celsius Fahrenheit karsiligi: "+((dereceDegeri*1.8)+32)+" Fahrenheit dir.");
            }

        }
        else System.out.println("Lutfen gecerli bir hacim cesidi giriniz...");


 */
       /* System.out.println("İsminiz: ");
        String name = scan.next();
        System.out.println("soyisminiz: ");
        String lastName = scan.next();
        System.out.println(name.toUpperCase()+" "+lastName.toUpperCase());

        */
/*
        System.out.println("İsim ve soyisminizi giriniz: ");
        String fullName = scan.nextLine();
        int firstSpace = fullName.indexOf(" ");

            String name1 = fullName.substring(0,firstSpace);
            String lastName1 = fullName.substring(firstSpace+1);
            System.out.println("Name: "+name1+" Last Name: "+lastName1);
        }


 */
        /*
        String str1 = "$13.73".replace("$","");
        String str2 = "$10.97".replace("$","");

        System.out.println("$"+Double.parseDouble(str1)+Double.parseDouble(str2));


         */

        System.out.println("Bir kelime giriniz: ");
        String kelime = scan.next();
        if (kelime.length()>=3){
            System.out.println(kelime.substring(kelime.length()-2));
        }
    }
}
