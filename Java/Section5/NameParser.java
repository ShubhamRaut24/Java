package Java.Section5;

import java.util.Locale;
import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName;
        String firstName;
        String lastName;

        System.out.println("Enter the full name");
        fullName = scanner.nextLine();
        int indexOfSpaces = fullName.indexOf(" ");

        firstName = fullName.substring(0,indexOfSpaces);
        lastName = fullName.substring(indexOfSpaces+1);

        firstName = firstName.toUpperCase();
        lastName = lastName.toLowerCase();

        System.out.println("first is "+firstName);
        System.out.println("last is "+lastName);




    }
}
