package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kacinci gun: ");
        int gun = scan.nextInt();
        String gunDurum="";
        switch (gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: gunDurum="Hafta ici";
                break;
            case 6:
            case 7: gunDurum="Hafta sonu";
                break;
            default: gunDurum = "hatali giris";
                break;
        }
        System.out.println(gunDurum);
    }
}
