package Java.Section3;

public class RepetitionFun {

    public static void main(String[] args) {
        int count=1;

        while (count<=10)
        {
            System.out.print(count+++" ");
        }
        System.out.println();
        System.out.println("-----------------------------");


        do {
            System.out.print(count+++" ");
        }while (count<=20); // do while loop at least one time
        System.out.println();
        System.out.println("-----------------------------");

        for(int i=1;i<=10;i++)
        {
            System.out.println(i++);
        }

    }
}
