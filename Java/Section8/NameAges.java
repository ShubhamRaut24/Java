package Java.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NameAges {

    public static void main(String[] args) {

        Scanner nameFile;
        Scanner ageFile;
        PrintWriter printWriter;

        try {

            nameFile = new Scanner(new File("studentNames.txt"));
            ageFile = new Scanner(new File("studentAges.txt"));
            printWriter = new PrintWriter("NameAges.txt");

            while (nameFile.hasNext() && ageFile.hasNext())
            {
                String tempName = nameFile.nextLine();
                int tempAge = ageFile.nextInt();
                printWriter.println(tempName+" is "+tempAge+" years old");
            }

            printWriter.close();
            nameFile.close();
            ageFile.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("file not found!!!!!!!!!");
        }
    }
}
