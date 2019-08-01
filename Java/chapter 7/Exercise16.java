//written by Daniel Beckerich
//on 4/16/2017 8L32PM
//this program tests whether a number is prime or not.
//for chapter 7 programming exercise 12

//get all of our librarys
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12
{
    public static void main(String args[]) throws IOException {  
     //set the variables
    Scanner in = null;
    PrintWriter out = null;
    String line = "", newline = "";
    String[] words = new String[2];
    int index = 0;
    
    //try to open the files.
    try {
         in = new Scanner(new FileReader("C:\\Users\\Daniel\\Documents\\NetBeansProjects\\inch to cm\\src\\input.txt"));
         out = new PrintWriter("C:\\Users\\Daniel\\Documents\\NetBeansProjects\\inch to cm\\src\\output.txt");
    }catch(IOException e) {
        //if that doesnt work print the error
        e.printStackTrace();
         }
     
        //while there is still data in the file
        while (in.hasNext()) {
            //increment the line count
            index++;
            
            //get the next line of text and split it
            line = in.nextLine(); 
            words = line.split(" ");

            //if there are 3 cells in the array
            //arreange the words and print it to the file
            if (words.length == 3){
                newline = words[0] + " "+ words[2] + " "+ words[1];
                out.println(newline);
            }
            //same for two-word lines.
            else if (words.length == 2){
                newline = words[0] + " "+ words[1];
                out.println(newline);
            }
            //if its not a two or three-word line tell the user there is an error and the specific line.
            else
                System.out.println("there is an error in the datafile on line: " + index);
                               }
     //close both the files
     in.close();
     out.close();
      }
}