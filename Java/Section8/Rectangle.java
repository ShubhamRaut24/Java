package Java.Section8;

public class Rectangle {

    private double length;
    private double width;

    private static int numRectangles;  // it is static that's why it even if object of rectangle class is not exits

    public Rectangle()
    {
        this(1.2,1.2);
    }
    public Rectangle(double length, double width) {  // parameterize constructor
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double area()
    {
        return length*width;
    }

    public double perimeter()
    {
        return (2*length)+(2*width);
    }

    public static int getNumRectangles()
    {
        return numRectangles;
    }


}
