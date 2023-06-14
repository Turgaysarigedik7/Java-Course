package DataCasting;

public class Casting {
    public static void main(String[] args) {
        int intSayi=129;
        byte byteSayi= (byte) intSayi;
        System.out.println(byteSayi);

        // byte +127 ye kadardır. manuel daraltmalarda sınır aşıldığında eksi rakamından başlayak asilan rakam kadar
        // rakam ilerler.
        // +129 rakamını byte'a manuel olarak daraltırsak 129-127=2 bu iki rakamı bytw'in en dusuk limitinden yukari dogru
        // tekrardan saymaya baslar -128+2=-128 1 (-127 2)


        double doubleSayi = 72.98;
        long longSayi = (long) doubleSayi;
        System.out.println(longSayi);

        long longSayi2 = 121234126;
        int intSayi2 = (byte) longSayi2;
        System.out.println(intSayi2);

        // long longSayi2 = 121234126;
        // byte intSayi2 = (int) longSayi2;
        // System.out.println(intSayi2);
    }
}
