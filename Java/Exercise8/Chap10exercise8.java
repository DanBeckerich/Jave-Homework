//written by Daniel Beckerich
//on 4/29/2017
//this program is designed to test the ExtDate class.
package chap10exercise8;


public class Chap10exercise8 {

    public static void main(String[] args) {
        //get a few variables
        int Day = 4;
        String sMonth = "April";
        int Year = 2017;
        
        ExtDate myDate = new ExtDate(Day,sMonth,Year);
        System.out.print("the Date is: ");
        System.out.println(myDate);
        
        
    }
    
}
