
import java.util.Scanner;

public class Circle{
    
    private double radius;
    
    public Circle(double r) { radius = r; }
    public Circle() { radius =0; }
    public Circle(int useless) {
        Scanner r = new Scanner(System.in);
        radius = r.nextDouble();
    }
    public double area() { return 3.14 * Math.pow(radius,2); }
    public double perimeter() { return 2 * 3.14 * radius; }
    public void setRadius(double r) { radius = r; }
    public double get() { return radius; }
}