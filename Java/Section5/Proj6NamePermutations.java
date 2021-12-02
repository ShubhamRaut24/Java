package Java.Section5;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj6NamePermutations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder[] stringBuilder = new StringBuilder[5];

        final int LENGTH_OF_STRING_BUILDER = stringBuilder.length;

        for (int i = 0;i<LENGTH_OF_STRING_BUILDER;i++)
        {
            System.out.print("Enter name "+i+" :");
            stringBuilder[i] = new StringBuilder(scanner.nextLine());
        }
//       for(int i=0; i<LENGTH_OF_STRING_BUILDER;i++)
//       {
//           System.out.println(stringBuilder[i]);
//       }

        System.out.println("-----------------------------------------------------------");

        for(int i = 0;i<LENGTH_OF_STRING_BUILDER;i++)
        {
            for(int j = 0;j<LENGTH_OF_STRING_BUILDER;j++)
            {
                String s = stringBuilder[i].substring(0,stringBuilder[i].indexOf(" ")) + stringBuilder[j].substring(stringBuilder[j].indexOf(" "));
                System.out.println(s);
            }
        }

   }
}
