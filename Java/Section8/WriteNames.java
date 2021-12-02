package Java.Section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteNames {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();

        try {

            PrintWriter printWriter = new PrintWriter("names.txt");
            System.out.println("Enter 5 names");
            for (int i = 0; i < 5; i++) {
                nameList.add(scanner.nextLine());
                printWriter.println(nameList.get(i));
            }
           printWriter.close();
        }catch (FileNotFoundException e)
        {
            System.out.println("fine not found!!!!!!!");
        }
    }
}
