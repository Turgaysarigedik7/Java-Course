package Operations;

public class Operation3 {
    public static void main(String[] args) {
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
    }
}
