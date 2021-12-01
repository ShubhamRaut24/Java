package Java.Section6;

public class MethodDemo {
    public static void main(String[] args)
    {
        printHello();

        printNumber(44);

       int receivedNumber = giveMeTen();

        System.out.println("received number is "+receivedNumber);

        int receivedAddition = addThese(10,15);

        System.out.println("received addition is "+receivedAddition);

        double result=getSquare(3.14);
        System.out.println("square is "+result);

    }

    public static void printHello()  // no return type & non parameterize
    {
        System.out.println("Hello world");
    }
    public static void printNumber(int number)  // no return type and parameterize
    {
        System.out.println("Number is "+number);
    }
    public static int giveMeTen()  // int return type And non parameterize
    {
        return 10;
    }
    public static int addThese(int number1, int number2)//int return type And parameterize
    {
        return number1 + number1;
    }

    public static double getSquare(double number)
    {
        return number*number;
    }

}
