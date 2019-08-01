//written by Daniel Beckerich
//on 4/19/2017 3:38 PM
//This program calculates the rate of inflation

package Exercise20

import java.util.Scanner;

class Exercise20{
    
    public static void main(String[] args){
        //declare the scanner
        Scanner console = new Scanner(System.in);
        //delcare variables
        double currentPrice;
        double year1Price;
        double year2Price;
        //variables for storing user input
        double input1;
        double input2;
        double input3;
        //set the output variables.
        double output1;
        double output2;
        
        //prompt the user to enter the three numbers that are needed
        System.out.println("please enter the current price of an iteam");
        input1 = console.nextInt();
        System.out.println("please enter the price of the same iteam from last year");
        input2 = console.nextInt();
        System.out.println("please enter the price of the same iteam from 2 years ago");
        input3 = console.nextInt();
        //calculate the current inflation rate
        output1 = inflationCalc(input1,input2);
        output2 = inflationCalc(input1,input3);
        //convert to percent
        output1 = output1 * 100;
        output2 = output2 * 100;
        //output and format.
        System.out.println("the inflation from the current year to the year before is: " + String.format("%.0f%%",output1));
        System.out.println("the inflation from the current year to two years ago is: " + String.format("%.0f%%", output2));
    }
    //this function calculates the rate of inflation