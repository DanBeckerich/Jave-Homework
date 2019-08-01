//written by Daniel Beckerich on 4/29/2017
//this class deffinition is for exercise 3 of chapter 10.
//this class impliments the storage and manipulation of a point on a 2d plane
package chap10exercise4;

public class Point {
    //these variables store the location of the point on a 2d plane    
    int Xloc;
    int Yloc;
    
    //constructors for a point
    Point(int X, int Y){
        Xloc = X;
        Yloc = Y;
    }
    
    Point(){
        Xloc = 0;
        Yloc = 0;
    }
   
    //set and get methods for both the X and Y coordinate
    public void setX(int x){
        Xloc = x;
    }
    
    public int getX(){
        return Xloc;
    }
    
    public void setY(int Y){
        Yloc = Y;
    }
    
    public int getY(){
        return Yloc;
    }
    
    //combined set.
    public void setXY(int X, int Y){
        Xloc = X;
        Yloc = Y;
    }
    
    //combined get. this will return an object containing the information
    public Point getXY(){
        return new Point(Xloc,Yloc);
    }
    
    //print X and Y to consol
    public void printXY(){
        System.out.println("X = " + Xloc);
        System.out.println("Y = " + Yloc);
    }
}
