package Java.Section5;

public class StringMethods1 {
    public static void main(String[] args) {
        String myName="Shubham";
        String yourName="R";

        for(int i=0;i<myName.length();i++)
        {
            System.out.print(myName.charAt(i)+" ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
        if(myName.equals(yourName))
        {
            System.out.println("names are equal");
        }
        else
            System.out.println("names are NOT equal");

        System.out.println("---------------------------------------");

        if(myName.compareTo(yourName)>0)
        {
            System.out.println("myName>yourName");
        }
        else
            System.out.println("myName<=yourName");


    }
}
