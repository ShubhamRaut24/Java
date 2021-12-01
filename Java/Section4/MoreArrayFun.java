package Java.Section4;

import java.sql.Array;
import java.util.Arrays;

public class MoreArrayFun {

    public static void main(String[] args) {
        int[] myArray=new int[10];

        int index=0;
        for (int i=1;i<11;i++)
        {
            myArray[index++]=i;
        }
        System.out.println(Arrays.toString(myArray));

    }


}
