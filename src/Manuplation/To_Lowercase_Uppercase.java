package Manuplation;

import java.util.Locale;

public class To_Lowercase_Uppercase {
    public static void main(String[] args) {
        String name = "Turgay Sefa Sarıgedik";

        System.out.println(name.toLowerCase(Locale.forLanguageTag("tr")));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase().charAt(0));
        System.out.println(name.toLowerCase(Locale.forLanguageTag("tr")).charAt(15));

        String name1 = "Turgay";
        String name2 = "turgay";
        System.out.println(name1.equals(name2));
        System.out.println(name1.toLowerCase().equals(name2));
        System.out.println(name1.equals(name2.toLowerCase()));
        System.out.println(name1.equalsIgnoreCase(name2));
    }
}
