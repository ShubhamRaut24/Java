package Java.Section3;

import java.util.Scanner;

public class ProjDivisibleByThree {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
        System.out.println("Enter the number to check And to Exit Enter any negative number or zero");
        input=scanner.nextInt();

        while (input>0)
        {
          if(input%3==0)
          {
              System.out.println(input+" is divisible by three");
          }
          else
              System.out.println(input+" is NOT divisible by three");
            System.out.println("Enter the number to check And to Exit Enter any negative number");
            input=scanner.nextInt();
        }


    }


}
