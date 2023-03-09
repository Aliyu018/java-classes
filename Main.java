/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    Circle c = new Circle();
	    c.setRadius(15);
       System.out.println("Radius = " + c.get());
       System.out.println("Area = " + c.area());
	   Circle c2 = new Circle(0);
	}
}
