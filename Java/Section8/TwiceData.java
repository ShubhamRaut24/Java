package Java.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwiceData {
    public static void main(String[] args) {
        Scanner dataFile ;
        PrintWriter printWriter;

        try{
            dataFile = new Scanner(new File("num.txt"));
            printWriter = new PrintWriter("twiceNum.txt");
            while (dataFile.hasNext())
            {
                printWriter.println(dataFile.nextInt()*2);
            }
            dataFile.close();
            printWriter.close();


        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found!!!");

        }


    }
}
