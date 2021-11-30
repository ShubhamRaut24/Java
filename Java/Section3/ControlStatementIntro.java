package Java.Section3;

public class ControlStatementIntro {
    public static void main(String[] args) {

        int age=15;

        if(age>=18)
        {
            System.out.println("you are eligible for driving");
        }
        else {
            System.out.println("you are NOT eligible for driving");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Odd number till "+age+" are");
        for (int i=1;i<age;i++)
        {
            System.out.println(++i);
        }



    }
}
