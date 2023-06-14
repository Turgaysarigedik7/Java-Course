package SwitchCase;

import java.util.Scanner;

public class SwitchCase2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kacinci ay: ");
        int ay = scan.nextInt();
        String mevsim="";
        switch (ay){
            case 12:
            case 1:
            case 2: mevsim="Kiş";
                break;
            case 3:
            case 4:
            case 5: mevsim="ilkbahar";
                break;
            case 6:
            case 7:
            case 8: mevsim="yaz";
                break;
            case 9:
            case 10:
            case 11: mevsim="sonbahar";
                break;
            default: mevsim="hatali giris!";
        }
        System.out.println(mevsim);
    }
}
