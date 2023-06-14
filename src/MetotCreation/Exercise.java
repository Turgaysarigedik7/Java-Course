package MetotCreation;

public class Exercise {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Devam etmek istiyor musunz?");
        String durum = scan.next();

        IstekKontrol(durum);*/
        System.out.println(NotHarfCeviri(50));
        StringToUpper("Turgay","Sefa");
        System.out.println(NumbersConcatinate(1,2));
        HarfKontrol("Turgay");
        DereceDonusturucu("f",10);
    }
    /**
     * IstekKontrol
     * <pre>
     *     Verilen durum bilgisine gore kullaniciyi bilgilenidirme mesajini consola yazdirir.
     * </pre>
     * @param durum String
     * @author Turgay Sefa Sarigedik
     */
    public static void IstekKontrol(String durum){
        if (durum.equalsIgnoreCase("evet")==true)
            System.out.println("Evet devam edebilirsiniz");
        else if (durum.equalsIgnoreCase("hayir"))
            System.out.println("Tesekkurler isleminiz bitmistir.");
        else System.out.println("Hatali giris");
    }


    /**
     * NotHarfCeviri
     * <pre>
     *     int olarak verilen notu harf notu olarak consola yazdirir.
     * </pre>
     * @param not int
     * @author Turgay Sefa Sarigedik
     */
    public static char NotHarfCeviri(int not){
        char notDurum = ' ';
        switch ((85 <= not && not <= 100 ) ? 0 :
                (60 <= not && not <= 84) ? 1 :
                        (50 <= not && not <= 59) ? 2 :
                                (50 <= not && not <= 59) ? 3 :4){
            case 0: notDurum='A';
                break;
            case 1: notDurum='B';
                break;
            case 2: notDurum='C';
                break;
            case 3: notDurum='D';
                break;
            default: notDurum='X';
                break;
        }
        return notDurum;
    }


    /**
     * StringToUpper
     * <pre>
     *     Verilen isim ve soyismi buyuk harfe cevirip char tipinde dondurur.
     * </pre>
     * @param name String
     * @param  surname String
     * @author Turgay Sefa Sarigedik
     */
    public static void StringToUpper(String name, String surname){
        System.out.println(name.toUpperCase()+" "+surname.toUpperCase());
    }


    /**
     * NumbersConcatinate
     * <pre>
     *     Verilen iki sayiyi string olarak yanyana yazip String turunde dondurur.
     * </pre>
     * @param sayi1 int
     * @param  sayi2 int
     * @author Turgay Sefa Sarigedik
     */
    public static String NumbersConcatinate(int sayi1, int sayi2){
        return sayi1+""+sayi2;
    }

    /**
     * HarfKontrol
     * <pre>
     *     Verilen bir kelimenin 3 veya daha fazla harften olusuyorsa son 2 harfini yanyana 3 kere
     *     //eger metin 3 harften kucuk ise kendisini consola yazdirir.
     * </pre>
     * @param kelime String
     * @author Turgay Sefa Sarigedik
     */
    public static void HarfKontrol(String kelime){
        if (kelime.length()>=3){
            String result = kelime.substring(kelime.length()-2);
            System.out.println(result+result+result);
        }
        else System.out.println("Verilen kelime "+kelime.length()+" harften olusmaktadir.");
    }

    //cantigrad ile fahrenheit birbirine ceviren bir uygulama yaziniz...
    /**
     * DereceDonusturucu
     * <pre>
     *     Verilen cantigrad veya fahrenheit derecelerini biribilerine cevirip consola yazdirir.
     * </pre>
     * @param dereceCesidi String
     * @param dereceDegeri double
     * @author Turgay Sefa Sarigedik
     */
    public static void DereceDonusturucu(String dereceCesidi, double dereceDegeri){
        System.out.println("Fahrenheit icin \"f\" yaziniz, Celsius icin \"c\" yaziniz...");

        if (dereceCesidi.equals("f") || dereceCesidi.equals("c")){

            System.out.println("Lutfen derece degeri giriniz...");
            if (dereceCesidi.equals("f")){
                System.out.println("girilen "+dereceDegeri+" Fahrenheit Celsius karsiligi: "+((dereceDegeri-32)/1.8)+" Celsius dur.");
            }
            else if (dereceCesidi.equals("c")){
                System.out.println("girilen "+dereceDegeri+" Celsius Fahrenheit karsiligi: "+((dereceDegeri*1.8)+32)+" Fahrenheit dir.");
            }

        }
        else System.out.println("Lutfen gecerli bir hacim cesidi giriniz...");
    }
}
