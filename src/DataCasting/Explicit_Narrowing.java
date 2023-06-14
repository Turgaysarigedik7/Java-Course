package DataCasting;

public class Explicit_Narrowing {
    public static void main(String[] args) {
       /* double doubleSayi = 3.14;
        long longSayi = (long) doubleSayi;
        System.out.println(longSayi);

        byte intSayi = 1;
        int byteSayi = (byte) intSayi;
        System.out.println(byteSayi);

        int vsayi = 4527;
        int s1 = vsayi%10;
        int s2 = vsayi%5;
        int s3 = vsayi%7;
        System.out.println((s1+s2+s3)+((char)vsayi/1000));
        System.out.println(vsayi/1000);

        int sayi1 = 10;
        sayi1 += 2;
        // += önce toplama işlemini yap sonra sonucu ATAMA yap!

        System.out.println(sayi1);

        int sayi2 = 10;
        sayi2 -= 2;
        // += önce toplama işlemini yap sonra sonucu ATAMA yap!

        System.out.println(sayi2);

        int sayi3= 20;
        sayi3++;
        System.out.println(sayi3);

        sayi3--;
        System.out.println(sayi3);



        int sayi3= 20;
        sayi3++;                    // Tek bir islem yapiliyor 1- sayi++ islemi
        System.out.println(sayi3);

        sayi3= 1+sayi3;

        sayi3--;                    //  Tek bir islem yapiliyor 1- sayi-- islemi
        System.out.println(sayi3);


        int sayi = 100;
        System.out.println(sayi);  //100


        System.out.println(sayi++);//100     iki islem yapiliyor 1- System.out.println ile consola bilgi basiliyor 2- sayi++
        //        bir artiriliyor.
        System.out.println(sayi);  //101



        sayi=100;
        //PREINCREMENT
        System.out.println(++sayi);//101     iki islem yapiliyor 1- System.out.println ile consola bilgi basiliyor 2- sayi++
        //        bir artiriliyor.
        System.out.println(sayi);  //101


        int sayi;

        sayi= 13+15-2+7;
        System.out.println(sayi);

        double sayi2=13+15-2+7;
        System.out.println(sayi2);


        System.out.println(13+15-2+7);
        System.out.println((double)13+15-2+7);


        int carpma = 4*2*(4*4)+14-15-3+(3-15);
        System.out.println(carpma);

        //4 farkli int degisken olusturun ve bu degiskenlerin her birine kendi istediginz birbirinden farklı sayiyi atayin
        //bu sayilari birbirleri ile çarparak 240 sayisina ulasmaya calisin.
        //sonuc degiskeni olusturun ve butun matematiksel islemleri bu degiskenin icerisinde yapin.

        //int sonuc = a * b * c *d; 8 - 3 - 10 - 1
        //System.out.println(sonuc);


        // 13 / 6 = 2   / = standart bolme islemi
        // 13 % 6 = 1   Modulus= Bolumden kalan sayi
        System.out.println(19%6);
        System.out.println(37%6);

        //System.out.println((double)37/6);   //6.166666666666667
        //System.out.println(37/6);           //6

        int sayi=556;
        System.out.println(sayi%10); //sayi= 556 consol= 6

        System.out.println((double)sayi/10); //55.6
        System.out.println(sayi/10); //55


        //int rakam, verilenSayi=4527, sayilarToplami  yukarida verilen degiskenleri kullanaraktan verilen dort basamakli
        //sayinin herbir basamagindaki sayilari birbirleriyle toplayiniz ve consolda yazdiniriz.
        //sayilarToplami=18; olacak.


        int verilenSayi=4527, sayilarToplami;                           //degiskenlerimizi tanimladik.
        sayilarToplami=verilenSayi%10;                  //7             //sayilarToplami degiskenine 4527 sayisinin birler basamagindaki 7 sayisini atayalim.
        verilenSayi=verilenSayi/10;                     //452           //4527 sayisi 452 sayisina donusturduk.
        sayilarToplami+=verilenSayi%10;                 //7+2=9         //452 sayisinin birler basamagindaki 2 yi dondurdur ve sayilarToplami ile topladik.
        verilenSayi=verilenSayi/10;                     //45            //452 sayisi 45 sayisina donusturduk.
        sayilarToplami+=verilenSayi%10;                 //9+5=14        //45 sayisinin birler basamagindaki 5 yi dondurdur ve sayilarToplami ile topladik.
        verilenSayi=verilenSayi/10;                     //4             //45 sayisi 4 sayisina donusturduk.
        sayilarToplami+=verilenSayi%10;                 //14+4=18       //4 sayisinin birler basamagindaki 5 yi dondurdur ve sayilarToplami ile topladik.

        System.out.println(sayilarToplami);*/
    }
}
