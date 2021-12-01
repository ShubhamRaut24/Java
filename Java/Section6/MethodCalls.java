package Java.Section6;

public class MethodCalls {

    public static void main(String[] args) {
       doSomething();

    }
    public static void doSomething()
    {
        System.out.println("in doSomething!!");
        int result = getSomeValue();
        System.out.println(result);

    }
    public static int getSomeValue()
    {
        return 144;
    }

}
