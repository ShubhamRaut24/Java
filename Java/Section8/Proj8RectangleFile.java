package Java.Section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8RectangleFile {

    public static void main(String[] args) {


        ArrayList<Rectangle> rectangleList = new ArrayList<>();

        fillArrayList(rectangleList);
        printArrayList(rectangleList);
    }

    public static void fillArrayList(ArrayList<Rectangle> rectanglesList)
    {
        Scanner infile;

        try {
            infile = new Scanner(new File("rectangleData.txt"));
            Rectangle tempRec;
            double length;
            double width;

            while (infile.hasNext())
            {
                length = infile.nextDouble();
                width =  infile.nextDouble();
                tempRec = new Rectangle(length,width);
                rectanglesList.add(tempRec);
            }


            infile.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");
        }
    }

    public static void printArrayList(ArrayList<Rectangle> rectanglesList)
    {
       for (Rectangle rec : rectanglesList)
       {
           System.out.println("length:"+rec.getLength());
           System.out.println("width:"+rec.getWidth());
           System.out.println("area:"+rec.area());
           System.out.println("perimeter:"+rec.perimeter());
           System.out.println("---------------------------------");
       }
    }


}
