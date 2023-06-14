package Operations;

public class ModulusUsing {
    public static void main(String[] args) {
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

        System.out.println(sayilarToplami);
    }
}
