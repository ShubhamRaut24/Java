package Java.Section3;

public class EvenOnly {
    public static void main(String[] args) {

        int count=1;

        while (count<=10)
        {
            if(count%2==0)
            {
                System.out.println(count);
            }
            count++;
        }

    }
}
