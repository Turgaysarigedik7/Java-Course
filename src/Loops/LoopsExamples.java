package Loops;

import java.util.Random;
import java.util.Scanner;

public class LoopsExamples {
    public static void main(String[] args) {
        // 10 ile 30 arasindaki(10 ve 30 dahil)
        // sayilari aralarinda virgul olarak ayni satirda yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi tahmin ediniz: ");
        int tahmin =scan.nextInt();

        TahminEt(tahmin);

    }

    private static void TahminEt(int tahmin) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int rastgeleSayi = rnd.nextInt(10)+1;
        System.out.println(rastgeleSayi);
        while (rastgeleSayi!=tahmin){
            if (rastgeleSayi>tahmin){
                System.out.println("Daha buyuk bir sayi giriniz:");
                tahmin = scan.nextInt();
            }
            else if(rastgeleSayi<tahmin){
                System.out.println("Daha kucuk bir sayi giriniz:");
                tahmin = scan.nextInt();
            }
            counter++;
        }
            counter++;
            System.out.println("Tebrikler "+counter+ ".tahminde bildiniz.");
    }

    private static int SayilariToplama(int sayiAdet) {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i=0;i<sayiAdet;i++){
            System.out.println("Sayi giriniz: ");
            toplam += scan.nextInt();
        }
        return toplam;

    }


    private static void FaktoriyelHesaplama(int sayi) {
        int result =1;
        for (int i=sayi;i>0;i--){
            result*=i;
        }
        System.out.println(result);
    }

    public static void TamsayiYazdir(int sayi){
        for (int i =1;i<=sayi;i++){
            if (i%3==0 && i%5==0){
                System.out.println("java Guzeldir");
            }
            else if (i%3==0){
                System.out.println("java");
            }
            else if (i%5==0){
                System.out.println("Guzeldir");
            }

            else {
                System.out.println(i);
            }

        }

    }


    /**
     * SayiYazdir
     * <pre>
     *      Verilen 10-30 arasindaki iki sayiyi aralarina virgul koyarak yazar
     * </pre>
     * @param sayi1 int
     * @param sayi2 int
     */
    public static void SayiYazdir(int sayi1,int sayi2){
        System.out.println(sayi1+","+sayi2);

    }
}
