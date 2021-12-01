package Java.Section6;

public class CountDown {

    public static void main(String[] args) {

        countDownFrom(10);
        System.out.println("------------------------------------");
        countUp(10,20);
    }

    public static void countDownFrom(int num)
    {
        if(num>0)
        {
            System.out.print(num+" ");
            countDownFrom(--num);
        }
    }

    public static void countUp(int num1,int num2)
    {
        if(num1<=num2)
        {
            System.out.print(num1+++" ");
            countUp(num1,num2);
        }
    }
}
