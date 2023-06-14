package IfElseUsing;

public class ElseIfUsing {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        //if
        if (a==b){
            System.out.println("verilen degiskenler esittir!");
        }

        if (a!=b){
            System.out.println("verilen degiskenler esit degildir!");
        }


        //if else
        //int a = 5;
        //int b = 10;

        // 10 fqrkli if else kodu yaziniz.
        if (a==b){
            System.out.println("verilen degiskenler esittir!");
        }
        else {
            System.out.println("else blogu calısti");
        }

        //if else
        if (a==b || a < b){
            System.out.println("if blogu calısti");
        }
        else {
            System.out.println("else blogu calısti");
        }

        //if else-if else
        if (a==b){
            System.out.println("if calisti");
        }
        else if (a>b) {
            System.out.println("1. else if blogu calısti");
        }
        else if (!(a < b)) {
            System.out.println("2. else if blogu calısti");
        }
        else {
            System.out.println("else calisti");
        }
        //------------------------
        if (a!=b){
            System.out.println("if calisti");
        }
        else if (a>b) {
            System.out.println("1. else if blogu calısti");
        }
        else if (!(a < b)) {
            System.out.println("2. else if blogu calısti");
        }
        else {
            System.out.println("else calisti");
        }
        //------------------------
        if (a==b){
            System.out.println("if calisti");
        }
        else if (a<b) {
            System.out.println("1. else if blogu calısti");
        }
        else if (a<b) {
            System.out.println("2. else if blogu calısti");
        }
        else {
            System.out.println("else calisti");
        }
        //------------------------
        if (a==b){
            System.out.println("if calisti");
        }
        else if (a>b) {
            System.out.println("1. else if blogu calısti");
        }
        else if (a < b) {
            System.out.println("2. else if blogu calısti");
        }
        else {
            System.out.println("else calisti");
        }
    }
}
