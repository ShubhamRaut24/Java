package Java.Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileOutputFun {

    public static void main(String[] args) {

        try {
            PrintWriter printWriter = new PrintWriter("output.txt");

            printWriter.println("Hello World");
            printWriter.println("my name is John Bought");
            printWriter.println(241298);

            printWriter.close();

        }
        catch (FileNotFoundException e)
        {
            System.out.println("can't find file");
        }
    }
}
