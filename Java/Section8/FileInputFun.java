package Java.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInputFun {

    public static void main(String[] args) {

        Scanner infile;

        try {
            infile = new Scanner(new File("input.txt"));
            int input=0;
            int sum=0;
            while (infile.hasNext())
            {
               input = infile.nextInt();
               sum += input;
               System.out.println(input);
            }
            System.out.println("sum is "+sum);
            infile.close();

        }catch (FileNotFoundException e)
        {
            System.out.println("can't find file");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error in reading input!!!!");
        }
    }


}
