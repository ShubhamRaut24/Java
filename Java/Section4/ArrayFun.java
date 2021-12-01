package Java.Section4;

public class ArrayFun {
    public static void main(String[] args) {

        int[] myArray=new int[5];

        myArray[0]=24;
        myArray[1]=25;
        myArray[2]=14;
        myArray[3]=29;
        myArray[4]=74;

        for(int i=0;i<myArray.length;i++)
        {
            System.out.println(myArray[i]);
        }
        System.out.println("----------------------------");
        for(int num:myArray)    // enhanced for loop
        {
            System.out.println(num);
        }

    }
}
