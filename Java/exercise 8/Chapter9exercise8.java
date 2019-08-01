//written by Daniel Beckerich
//on 4/8/2017
//this program allows the user to enter students names and testscores.
//when the user is finished the program will display the testscore average,
//the names of the students who scored below avereage, and all students who scored
//the highest.

package chapter9exercise8;
//import Vectors. i dont like having a fixed number of students, so i will do it with vectors instead
import java.util.Vector;
import java.util.Scanner;

public class Chapter9exercise8 {

    public static void main(String[] args) {
        //I am using Vectors, because it will make things much easier
        Vector<String> Names = new Vector<String>();
        Vector<Integer> Scores = new Vector<Integer>();
        //create a scanner
        Scanner sc = new Scanner(System.in);
        //and two variables to hold the user input
        String line;
        int score;
        //to calculate the total, we need two variables. total and count.
        int total = 0;
        int count = 0;
        int average = 0;
        int highest = 0;
       
        //prompt the user to enter the information
        System.out.println("Enter the the test score first then the name of the student");
        System.out.println("Enter -1 to finnish entering in data");
        
        //get the information from the user
        //to make things easier, we will get the the score first
        //and the rest of the line after.
        score = sc.nextInt();
        line = sc.nextLine();
        
        //repeat until they enter -1
        while (score != -1){
            //add the score to the vector, and to the total
            Scores.add(score);
            total = total + score;
            //add the string portion.
            Names.add(line);
            
           //increment the count.
           count = count + 1;
           
           //after that is finished, get the next line
           score = sc.nextInt();
           line = sc.nextLine();           
        }
        
        //calculate the average and print it
        average = total/count;
        System.out.println("The average score is: " + average);
        System.out.println("The following students scored below average");
        //find all students who scored lower than the average. and calculate the highest score
        for (int i = 0; i < (count); i++){
            if (Scores.get(i) < average)
                System.out.println(Names.get(i) + " " + Scores.get(i));
      
        if (Scores.get(i) > highest)
            highest = Scores.get(i);
        }
        
        //print out the highest score
        System.out.println("The highest score is " + highest);
        System.out.println("the following students scored the highest");
        
        for (int z = 0; z < (count); z++)
            if (Scores.get(z) == highest)
                System.out.println(Names.get(z));
        
        
    }
    
}
