package Java.Section6;

import java.util.Random;

public class FunWith2DArray {
    public static void main(String[] args) {
        int[][] twoDArray = new int[3][3];

        fillTwoDArray(twoDArray);
        printTwoDArray(twoDArray);
        System.out.println("--------------------");
        twice2DArray(twoDArray);
        printTwoDArray(twoDArray);


    }

    public static void fillTwoDArray(int[][] twoDArray)
    {
        Random random = new Random();
        for (int i = 0;i<twoDArray.length;i++ )
        {
            for (int j = 0;j<twoDArray[i].length;j++)
            {
                twoDArray[i][j] = random.nextInt(100);
            }
        }
    }

    public static void printTwoDArray(int[][] twoDArray)
    {
        for (int[] arr : twoDArray)
        {
            for(int num : arr)
            {
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static void twice2DArray(int[][] twoDArray)
    {
        for(int i = 0; i<twoDArray.length;i++)
        {
            for (int j = 0;j<twoDArray[i].length; j++)
            {
                twoDArray[i][j] *= 2;
            }
        }
    }


}
