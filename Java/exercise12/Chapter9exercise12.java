//written by Daniel Beckerich
//on 4/28/2017
package chapter9exercise12;

import java.io.*;
import java.util.Arrays;

public class Chapter9exercise12 {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\Daniel\\Documents\\NetBeansProjects\\Chapter9exercise12\\src\\chapter9exercise12\\datafile.txt";
        String line = null;
        //an array for the total miles, and one for names.
        int[][] miles = new int[5][7];
        int[] totals = new int[5];
        String[] names = {"Jason","Samantha","Ravi","Sheila","Ankit"};
        String[] temp;
        int position;
        
        try {
            //get out text file
            FileReader fileReader =  new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null) {
                //split the line into the different words, seperaited by " "
                temp = line.split(" ");
                
                //match the jogger to their place in the array
                position = Arrays.asList(names).indexOf(temp[0]);
                for (int i = 1; i < 5; i++ )
                    miles[position][i] = Integer.parseInt(temp[i]);
            }
            //add everything up into totals.
            for (int i = 0; i < 5; i++)
                for (int z = 0; z < 6; z++)
                    totals[i] += miles[i][z];
            
            //now print the information
            
            for (int i = 0; i < 5; i++)
                System.out.println(names[i] + " ran " + totals[i] +" miles");
            
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
