package Loops;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Loop lari ogrendin mi?");
        String cevap = scan.nextLine();

        MetotCall(cevap);*/

        int week =3;
        int day = 4;
         for (int i=1;i<=week;i++){
             System.out.println(i);
             for (int j=1;j<=day;j++){
                 System.out.print(j+" ");
             }
             System.out.println(" ");
         }
    }
    public static void MetotCall(String cevap){
        if (cevap.equalsIgnoreCase("evet")==true){

            for(int i = 0;i<5;i++){
                System.out.println("Looplari ogrendim");
            }
        }
        else if (cevap.equalsIgnoreCase("hayir")==true) {
            for (int i = 0;i<15;i++)
                System.out.println("Looplari ogrenemedim");
        }
        else {
            System.out.println("Hatali cevap");
        }

    }
}
