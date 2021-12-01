package Java.Section4;

import java.util.ArrayList;

public class WrapperFun {
    public static void main(String[] args) {

        ArrayList<Integer> myArrayList=new ArrayList<>();

        myArrayList.add(new Integer(10)); // no need for this because it does autoboxing for us
        myArrayList.add(20);
        for(int num:myArrayList)
        {
            System.out.println(num);
        }
        System.out.println("----------------------");
        String anyValue="142";
        int numericValue=Integer.parseInt(anyValue);
        System.out.println(numericValue+8);
        System.out.println("----------------------");

        String doubleValue="3.14465";
        double doubleValueToDouble=Double.parseDouble(doubleValue);
        System.out.println(doubleValueToDouble+1);


    }
}
