import java.util.Scanner;

public class Rectangle{
    
    private double height;
    private double width;
    
    public Rectangle(){
        height = 0;
        width = 0;
    }
    public Rectangle(double h, double w){
        height = h;
        width = w;
    }
    public Rectangle(int useless){
        Scanner r = new Scanner(System.in);
        height = r.nextDouble();
        width = r.nextDouble();
    }
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width + height) * 2;
    }
}