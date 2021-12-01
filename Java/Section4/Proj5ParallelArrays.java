package Java.Section4;

import java.util.ArrayList;
import java.util.Scanner;

public class Proj5ParallelArrays {

    public static void main(String[] args) {
        ArrayList<String> namesOfPeopleList=new ArrayList<>();
        ArrayList<Integer> ageOfPeopleList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<5;i++)
        {
            System.out.print("Enter name:");
            namesOfPeopleList.add(scanner.nextLine());

            System.out.print("Enter age:");
            ageOfPeopleList.add(scanner.nextInt());

            scanner.nextLine();
        }
        for (int i=0;i<namesOfPeopleList.size();i++)
        {
            System.out.println(namesOfPeopleList.get(i)+" is "+ageOfPeopleList.get(i)+" year old");
        }

    }

}
