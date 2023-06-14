package MetotCreation;

import java.util.Scanner;

public class MetotCreationExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Loop lari ogrendin mi?");
        String cevap = scan.nextLine();

        metotCall(cevap);
    }
    public static int toplayipCarpma(int sayi1,int sayi2){
        return (sayi1+sayi2)*2;
    }
    public static String StringConcatination(String str1,String str2){
        return str1+str2;
    }
    public static void GunKontrol(String gun){
        String gunDurum ="";
        switch (gun.toLowerCase()){
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "perşembe":
            case "cuma": gunDurum="Hafta ici"; break;
            case "cumartesi":
            case "pazar": gunDurum="Hafta sonu"; break;
            default: gunDurum="Hatali giris"; break;

        }
        System.out.println(gun+" gunu "+gunDurum+" dir.");
    }

    public static void metotCall(String cevap){
        if (cevap.equalsIgnoreCase("evet")==true){

                for(int i = 0;i>5;i++){
                    System.out.println("Looplari ogrendim");
                }
        }
        else if (cevap.equalsIgnoreCase("hayir")==true) {
            for (int i = 0;i>15;i++)
                System.out.println("Looplari ogrenemedim");
        }
        else {
                System.out.println("Hatali cevap");
        }

    }

}
