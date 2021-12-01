package Java.Section4;

import java.util.ArrayList;

public class ArrayListFun {

    public static void main(String[] args) {
        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("John");
        nameList.add("sean");
        nameList.add("kyle");
        nameList.add("Amanda");
        nameList.add("wendy");
        nameList.add("Marty");

        for (int i=nameList.size()-1;i>=0;i--)
        {
            System.out.println(nameList.get(i));
        }
        System.out.println("-------------------");
        for(String name:nameList){
            System.out.println(name);
        }

    }
}
