package Java.Section7;

public class HouseDemo {



    public static void main(String[] args) {

        House myHouse = new House();
        House yourHouse = new House(3,6,"Red");

        printHouseData(myHouse);
        System.out.println("--------------------------------------------------------------------------------");
        printHouseData(yourHouse);
        System.out.println("--------------------------------------------------------------------------------");
        myHouse.setNumStories(4);
        myHouse.setNumWindows(8);
        myHouse.setColor("Blue");
        printHouseData(myHouse);


    }

    public static void printHouseData(House house)
    {
        System.out.println("The house is of "+house.getColor()+" color and it has "+house.getNumStories()+
                " Stories and also is has "+house.getNumWindows()+" windows");
    }
}
