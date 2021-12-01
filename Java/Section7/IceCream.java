package Java.Section7;

import java.util.ArrayList;

public class IceCream {

    private String name;
    private int cost;
    private int  numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        toppings = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void addToppings(String toppings)
    {
       this.toppings.add(toppings);
    }

    public void printToppings()
    {
      for(String toppings : toppings)
      {
          System.out.println(toppings);
      }
    }
}
