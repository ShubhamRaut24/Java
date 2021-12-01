package Java.Section3;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int input;

        System.out.println("Enter non-negative number to continue");
        System.out.println("Enter negative number for Exit");
        input=scanner.nextInt();
        while (input>0)
        {
            sum+=input;//sum=sum+input;
            System.out.println("enter non-negative number to continue");
            System.out.println("Enter negative number for Exit");
            input=scanner.nextInt();

        }
        System.out.println("sum is "+sum);
    }
}
