package Java.Section3;

import java.util.Scanner;

public class SelectionFun {

    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Welcome to Pub and Grills");
        System.out.println("please enter your age");
        age=scanner.nextInt();

        if(age>=21)
        {
            System.out.println("Here Have a beer!!");
        }
        else if(age>=16)
        {
            System.out.println("Here have a coke!!");
            System.out.println("at least you can drive");
        }
        else
        {
            System.out.println("Here have a coke!!");
        }

        System.out.println("Thanks for coming pub and grills");
    }
}
