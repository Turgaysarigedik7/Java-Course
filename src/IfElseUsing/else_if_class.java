package IfElseUsing;

public class else_if_class {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        if(a==b){
            System.out.println("Esittir");
        }
        else if (a<b){
            System.out.println("B büyüktür");
        }
        else if (a>b){
            System.out.println("A büyüktür");
        }
        else if (a!=b){
            System.out.println("A esit degil B");
        }
        else if (a>0 && a<b){
            System.out.println("A sifirdan buyuktur ve b den kucuktur");
        }
        else if (a>0 || a<b){
            System.out.println("A sifirdan buyuktur yada b den kucuktur");
        }
        else if (a>0 || a==0){
            System.out.println("A sifirdan buyuktur yada a sifirdir");
        }
        else if (a==0 || b==0){
            System.out.println("A yada b den sifirdir");
        }
        else if (a==0 && b==0){
            System.out.println("A ve b den sifirdir");
        }
        else{
            System.out.println("Hicbir kosula uymuyor");
        }
    }

}
