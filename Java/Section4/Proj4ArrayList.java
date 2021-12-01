package Java.Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj4ArrayList {
    public static void main(String[] args) {
        ArrayList<Double> myDoubleList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter value");
            double tempValue=scanner.nextDouble();
            if(tempValue>0){
            myDoubleList.add(tempValue);}
            else{break;}

        }
          for(int i=myDoubleList.size()-1;i>=0;i-- )
          {
              System.out.println(myDoubleList.get(i));
          }


    }
}
