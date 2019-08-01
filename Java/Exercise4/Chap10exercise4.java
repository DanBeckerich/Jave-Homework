//written by Daniel Beckerich on 4/29/2017
//this program is to test the classes Point and Circle.
//for Chapter 10 exercise 4

package chap10exercise4;


public class Chap10exercise4 {


    public static void main(String[] args) {
            //create a circle to test with
            Circle mycircle = new Circle(2,3,2.5);
           
            //print the information in the circle
            System.out.println("My circle is at X: " + mycircle.getX() + " Y: " + mycircle.getY());
            System.out.println("the radius of my circle is: " + mycircle.getRadius());
            System.out.println("the area of my circle is: " + mycircle.getArea());
            System.out.print("the circumference of my circle is: ");
            System.out.printf("%.2f%n",mycircle.getCircumference());
            
            //make the circle bigger.
            mycircle.setRadius(mycircle.getRadius() + 1);
            
            //chane the position
            mycircle.setXY(1,6);
            
           //print a bar to seperait the information and reprint everything
           System.out.println("---------------------------------------------");
           System.out.println("My circle is at X: " + mycircle.getX() + " Y: " + mycircle.getY());
           System.out.println("the radius of my circle is: " + mycircle.getRadius());
           System.out.println("the area of my circle is: " + mycircle.getArea());
           System.out.print("the circumference of my circle is: ");
           System.out.printf("%.2f%n",mycircle.getCircumference());
    }
    
}
