package Java.Section7;

public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Strawberry",30,2);
        IceCream yourIC = new IceCream("Vanilla",25,1);
        myIC.addToppings("nuts");
        myIC.addToppings("Sprinkles");

        yourIC.addToppings("cherries");

        print(myIC);
        print(yourIC);
        

    }
    public static void print(IceCream iceCream)
    {
        System.out.println(iceCream.getName());
        System.out.println(iceCream.getCost()+" Rs");
        System.out.println(iceCream.getNumScoops());
        iceCream.printToppings();
        System.out.println("---------------------------------");
    }
}
