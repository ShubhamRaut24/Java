package Java.Section3;

import java.util.Random;

public class RandomFun {

    public static void main(String[] args) {
        Random random=new Random();

        int myRandomNumber=random.nextInt();
        System.out.println(myRandomNumber);

        myRandomNumber=random.nextInt(100); //0 to 99
        System.out.println(myRandomNumber);
        for(int i=0;i<10;i++)
        {
            myRandomNumber=random.nextInt(100); //0 to 99
            System.out.println(myRandomNumber);
        }
    }
}
