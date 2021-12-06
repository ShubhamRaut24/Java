package Regex;

import java.util.regex.Pattern;

public class CharacterRegex {

    public static void main(String[] args) {

        System.out.println(Pattern.matches("[xyz]","x")); // true because it has x in it
        System.out.println(Pattern.matches("[xyz]","eqa")); // false because it does not have x or y or z
        System.out.println(Pattern.matches("[xyz]","xxyyz")); // false because it has x and y multiple time.
        System.out.println(Pattern.matches("[^abc]","x")); // return true only when input is not a or b or c
        System.out.println(Pattern.matches("[a-z A-Z]","A")); // returns true only when char is between a to z or A to Z
        System.out.println(Pattern.matches("[a-d[m-p]]","")); // returns true only when u pass char between a to d and m to p
        System.out.println(Pattern.matches("[a-z && [def]]","y e"));
    }
}
