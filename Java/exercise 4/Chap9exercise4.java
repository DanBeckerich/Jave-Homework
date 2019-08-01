//wrtten by Daniel Beckerich
//on 4/28/2017
//this program is designed to read through a text file and caatagorize a list
//of test scores into different brackets.

package chap9exercise4;

import java.io.*;
import java.util.Arrays;

public class Chap9exercise4 {

    public static void main(String[] args) {
        //open the file. this will need changing on a different machine.
        String fileName = "C:\\Users\\Daniel\\Documents\\NetBeansProjects\\chap9exercise4\\src\\chap9exercise4\\testscore.txt";
        String line = null;
        int num;
        
        //set up an array to store all the values
        Integer[] ranges = new Integer[8];
        Arrays.fill(ranges,0);

        try {
            //get out text file
            FileReader fileReader =  new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            //while not eof do stuff
            while((line = bufferedReader.readLine()) != null) {
                //parse the string into an int
                num = Integer.parseInt(line);
                //sort through everything
                if (num >= 0 && num <= 24)
                    ranges[0] = ranges[0] + 1;
                else if ((num >= 25 && num <= 49))
                    ranges[1] = ranges[1] + 1;
                 else if ((num >= 50 && num <= 74))
                    ranges[2] = ranges[2] + 1;               
                 else if ((num >= 75 && num <= 99))
                    ranges[3] = ranges[3] + 1;
                 else if ((num >= 100 && num <= 124))
                    ranges[4] = ranges[4] + 1;
                 else if ((num >= 125 && num <= 149))
                    ranges[5] = ranges[5] + 1;
                 else if ((num >= 150 && num <= 174))
                    ranges[6] = ranges[6] + 1;
                 else if ((num >= 175 && num <= 200))
                    ranges[7] = ranges[7] + 1; 
            }   
            //print it out
            System.out.println("0-24: " + ranges[0]);
            System.out.println("25-49: " + ranges[1]);
            System.out.println("50-74: " + ranges[2]);
            System.out.println("75-99: " + ranges[3]);
            System.out.println("100-124: " + ranges[4]);
            System.out.println("125-149: " + ranges[5]);
            System.out.println("150-174: " + ranges[6]);
            System.out.println("175-200: " + ranges[7]);
            
            
            
            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
    }
    
}
