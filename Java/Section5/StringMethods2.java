package Java.Section5;

import java.util.Locale;

public class StringMethods2 {
    public static void main(String[] args) {
        String name="Johnny Deep";

        String upper=name.toUpperCase();
        String lower=name.toLowerCase();

        System.out.println("upper case name "+upper);
        System.out.println("lower case name "+lower);

        int whereIsD=name.indexOf("D");
        System.out.println("index is "+whereIsD);
    }
}
