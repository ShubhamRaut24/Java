package Java.Section3;

import java.util.Random;
import java.util.Scanner;

public class ProjGuessTheNumber {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner scanner=new Scanner(System.in);
        int computerGeneratedNumber= random.nextInt(20)+1;
        System.out.println("guess the number between 1 to 20 ");
        System.out.println("You have 7 attempts to guess number");
        int attempts=7;
        while (attempts>0)
        {
            System.out.println("enter the number you have guessed");
            int userNumber=scanner.nextInt();
            if(userNumber==computerGeneratedNumber)
            {
                System.out.println("congratulations you guess the right number!!!"+userNumber);
            }
            else
            {
                System.out.println("opss!! you guess the wrong number!!!");
                attempts--;
                System.out.println(attempts+" attempts remaining ");
            }

        }
        if(attempts==0)
        {
            System.out.println("Game Over!!! You don't have any attempts left");
            System.out.println("The actual number was "+computerGeneratedNumber);
        }
    }
}
