package Java.Section7;

public class CircleDemo {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.2);
        Circle circle3 = new Circle(4);

        printCircleData(circle1);
        printCircleData(circle2);
        printCircleData(circle3);

    }

    public static void printCircleData(Circle circle)
    {
        System.out.println("Radius:"+circle.getRadius());
        System.out.println("Circumference:"+String.format("%.2f",circle.circumference()));
        System.out.println("Area:"+String.format("%.2f",circle.area()));
        System.out.println("--------------------------");

    }
}
