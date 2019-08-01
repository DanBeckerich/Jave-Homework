//written by Daniel Beckerich
//on 4/16/2016 7:32PM
//this program is for programming exercise 8

import java.util.Scanner;

public class Exercise8
{
	public static void main(String[] args) {
		//create the scanner object for user input.
      Scanner console = new Scanner(System.in);
      String inputString;
      //prompt the user to enter a word to check
      System.out.println("Enter a string to check if its a Palindrome.");
      inputString = console.next();
      //check to see if the entered string is a palindrome or not.
      if(isPalindorme(inputString))
               System.out.println("You have entered a valid Palindrome");
      else
               System.out.println("You have not entered a valid Palindrome");
      
	}
   
   //this checks to see if a string is a Palindrome or not
   public static boolean isPalindorme(String str){
         int len = str.length();
         int i, j;
         
         str = str.toLowerCase();
         
         j = len - 1;
         
         for(i = 0; i <= (len - 1)/2; i++){
         
            if (str.charAt(i) != str.charAt(j))
               return false;
            j--;
         }
         
        return true;
   }
   
}