import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in); //Kullanıcıdan değer almak için scanner oluşturduk
       System.out.println("Ad Gir:"); //Kullanıcının adını yazmasını istedik
       String kullaniciAdi=scan.nextLine(); //Kullanıcının girdiği ismi kullaniciAdi isimli değişkene atadık
       System.out.println("Kullanıcı Adı: "+kullaniciAdi); //Girilen ismi yazdırmak
    }
}