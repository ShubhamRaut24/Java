package Java.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleDemoProj {

    public static void main(String[] args) {

        ArrayList<Circle> circleList = new ArrayList<>();

        fillArrayList(circleList);
        printArrayList(circleList);

    }


    public static void fillArrayList(ArrayList<Circle> circleList)
    {
        Scanner infile;
        try {
            infile = new Scanner(new File("circledata.txt"));
            double radius;
            Circle tempCircle;

            while (infile.hasNext())
            {
                radius = infile.nextDouble();
                tempCircle = new Circle(radius);
                circleList.add(tempCircle);
            }
            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error while finding file!!!!!");
        }
    }
    public static void printArrayList(ArrayList<Circle> circleList)
    {
        PrintWriter printWriter;

        try {
            printWriter = new PrintWriter("circleOutput.txt");

            for (Circle circle : circleList)
            {
                printWriter.println("Radius:"+circle.getRadius());
                printWriter.println("Area"+circle.area());
                printWriter.println("circumference:"+circle.circumference());
                printWriter.println("---------------------------------------");
            }
             printWriter.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error  in printing!!! ");
        }
    }

}
