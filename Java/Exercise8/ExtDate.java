//written by Daniel Beckerich on 4/29/2017
//an extension of the Date class. designed to better implement the storage
//and usage of Dates.
package chap10exercise8;


public class ExtDate extends Date {
    String sMonth;
    
    //create the constructors
    ExtDate(){
        Day = 0;
        Month = 0;
        sMonth = "";
        Year = 0;
    }
    
    ExtDate (int newDay, int newMonth, int newYear){
        Day = newDay;
        Month = newMonth;
        Year = newYear;
    }
    
    ExtDate (int newDay, String newMonth, int newYear){
        Day = newDay;
        sMonth = newMonth;
        Year = newYear;
    }
    
    //create a new setDate method that takes strings
    public void setDate(int newDay, String newMonth, int newYear){
        Day = newDay;
        sMonth = newMonth;
        Year = newYear;        
    }
    
    public String getDate(){
        return (sMonth +"-"+ Day +"-"+ Year);
    }
    
    @Override
    public String toString(){
        return (sMonth +"-"+ Day +"-"+ Year);
    }
}
