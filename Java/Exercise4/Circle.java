//written by Daniel Beckerich on 4/29/2017
//this class extends the Point class
//this will implement information pretaining to circles, in addition to having
//the functionality of storing a 2D position
package chap10exercise4;


public class Circle extends Point {
    //create radius variable
    double Radius;
    //create a constant for PI because i want to avoid importing java.math
    private final double PI = 3.14;
    
    
    //two constructors
    //one with no input
    Circle(){
        Xloc = 0;
        Yloc = 0;
        Radius = 0;
    }

    //one with both X and Y
    Circle(int X, int Y){
        Xloc = X;
        Yloc = Y;
        Radius = 0;
    }
    
    //and one with all 3
    Circle(int X, int Y, double Rad){
        Xloc = X;
        Yloc = Y;
        Radius = Rad;
    }

    //set and get for radius
    public void setRadius(double Rad){
        Radius = Rad;
    }
    
    public double getRadius(){
        return Radius;
    }
    
    // calculate the area
    public double getArea(){
        return (PI * (Radius * Radius));
    }
    
    //calculate the Circumference
    public double getCircumference(){
        return (2 * PI * Radius);
    }
}
