package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("...xx.");
        Matcher matcher = pattern.matcher("AxxB");
        System.out.println("String matches given regex: "+matcher.matches());

    }
}
