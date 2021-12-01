package Java.Section3;

import java.util.Random;

public class DiceFun {

    public static void main(String[] args) {
        Random random=new Random();

        int diceValue;
        for(int i=0;i<10;i++)
        {
            diceValue=random.nextInt(6)+1; // this is called shifting through this it will print 1-6 values now4
            System.out.println(diceValue);
        }

    }
}
