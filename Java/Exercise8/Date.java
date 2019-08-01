//written by Daniel Beckerich on 4/29/2017
//this class implements the basics of a Date datatype
//given in the book on page 685-686
package chap10exercise8;

public class Date {

    //define variables
    int Day;
    int Month;
    int Year;
    
    //defalt cunstructor. set to a day when dinosaurs roamed the earth...
    Date(){
        Day = 1;
        Month =1;
        Year = 1900;
    }
    
    Date(int newDay, int newMonth, int newYear){
        Day = newDay;
        Month = newMonth;
        Year = newYear;
    }
    //set method for the date. this is all that is in the book, so that is all
    //im going to write
    public void setDate(int newDay, int newMonth, int newYear){
        Day = newDay;
        Month = newMonth;
        Year = newYear;
    }
    
    //get methods for the day, month, and year.
    public int getDay(){
        return Day;
    }
    
    public int getMonth(){
        return Month;
    }
    
    public int getYear(){
        return Year;
    }
    
    public String toString(){
        return (Month + "-" + Day + "-" + Year);
    }
}
