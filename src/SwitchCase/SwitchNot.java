package SwitchCase;

import java.util.Scanner;

public class SwitchNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Not giriniz: ");
        int not = scan.nextInt();
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
        System.out.println(notDurum);
    }
}
