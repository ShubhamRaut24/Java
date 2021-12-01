package Java.Section7;

public class RectangleDemo {


    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2,3.2);

        System.out.println(Rectangle.getNumRectangles());

        Rectangle rectangle3;

        System.out.println("After rectangle3 declared "+ Rectangle.getNumRectangles());

        rectangle3=new Rectangle(5,5);

        System.out.println("After rectangle3 initialized "+ Rectangle.getNumRectangles());

        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());

    }
}
