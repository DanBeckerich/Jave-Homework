//written by Daniel Beckerich
//on 4/16/2017 8L32PM
//this program tests whether a number is prime or not.
//for chapter 7 programming exercise 12

import java.util.Scanner;

public class Exercise12
{
    public static void main(String[] args){
        //create are scanner object
        Scanner console = new Scanner(System.in);
        //and the variable(s) for the program
        int input;
        
        //ask the user for a number to be tested.
        System.out.println("Enter a positive number to be tested for primality");
        input = console.nextInt();
        
        //test to see if its negitive or not
        if (input > 0){
                if (PrimeCheck(input)){
                    System.out.println("the number that was entered is prime"); }
                else{
                    System.out.println("the number that was entered is not prime");} }
        else{
            System.out.println("the number that was entered is less than 0"); }
    }
    
   static boolean PrimeCheck(int num) {
    //check if n is a multiple of 2
    if (num % 2 == 0) return false;
    //if not, then just check the odds
    for(int i=3; i * i <=num; i += 2) {
        if( num % i == 0)
            return false;
    }
    return true; } 
}