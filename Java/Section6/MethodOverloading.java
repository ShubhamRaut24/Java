package Java.Section6;

public class MethodOverloading {

    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result =  getResult(10,30);
        System.out.println(result);

        result = getResult(40,"10");
        System.out.println(result);

    }
    public static int getResult(int num)
    {
        return num * 2;
    }
    public static int  getResult(int num1, int num2)
    {
       return num1 + num2;
    }
    public static int getResult(int num, String number)
    {
        return num * Integer.parseInt(number);
    }

}
