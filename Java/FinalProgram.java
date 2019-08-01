/*
Created by Daniel Beckerich
for Java Programming CS241
 */

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class FinalProgram {
  public static void main(String[] args) throws IOException {
     
    menuSystem menu = null;
    try {menu = new menuSystem();}
    catch (IOException ex) {System.exit(0);}
        
        //run the main menu, and get the selection. recursion will be used to make more selections in the future.
        menu.print_mainMenu();
        menu.menu_selection();
    
        
  }
}	
	//menu handler
  class menuSystem {
        //set ALL the variables.
        Scanner console;
        String selection;
        BufferedReader file;
        int linecount = 0;
        List<Integer> Day      = new ArrayList<Integer>();
        List<String>  Name     = new ArrayList<String>();
        List<Double>  Calories = new ArrayList<Double>();
        List<Double>  Carbs    = new ArrayList<Double>();
        List<Double>  Protein  = new ArrayList<Double>();
        List<Double>  Fat      = new ArrayList<Double>();
        List<Double>  Fiber    = new ArrayList<Double>();
        List<Double>  Weight   = new ArrayList<Double>();
        //Get the data file.
        BufferedReader reader = new BufferedReader( new FileReader("dataFile.txt"));

        //heres the constuctor. this will call the parse method to break up the datafile.
        menuSystem() throws FileNotFoundException, IOException 
        {
        console = new Scanner(System.in);
        
         
         //take the datafile, and split it into there variables using the parse function
         this.parse(reader);
         
        }
         
        //print out the main menu
        public void print_mainMenu() {
        System.out.println("============================================================================");
        System.out.println("Welcome to the Cal-o-track 9000!");
        System.out.println("Type 'total' to veiw the daily total nutriants consumed");
        System.out.println("Type 'average' to veiw the average nutriants consumed per day");
        System.out.println("Type 'most' to veiw which days consumed the most calories, carbs, protein, fat, and fiber");
        System.out.println("Type 'good' days to veiw how many times under 2000 calories were consumed in a day");
        System.out.println("Type 'low' cal to veiw how many low-calorie iteams were consumed in total");
        System.out.println("============================================================================");
        }
        
        public void veiwTotal() throws IOException{
            //set the array to the number of days(number of lines/15) and number of values
            //the first dimension represents the day of the week, and the the other represents what is being stored.
            double[][] totals = new double[linecount/15][5];
            int tmp = 0;
            
            //cycle through each day,
            for(int x = 0; x<7; x++){
                //and every iteam in that day
                for(int y = 0; y<15; y++){
                    tmp = tmp + 1;
                    totals[x][0] = totals[x][0] + Calories.get(tmp - 1);
                    totals[x][1] = totals[x][1] + Carbs.get(tmp - 1);
                    totals[x][2] = totals[x][2] + Protein.get(tmp - 1);
                    totals[x][3] = totals[x][3] + Fat.get(tmp - 1);
                    totals[x][4] = totals[x][4] + Fiber.get(tmp - 1);}
                    }
                  
                        for (int i = 0; i<7; i++){
                        System.out.print ("the total amount of nutriants consumed on day: " + (i+1) + " was  Calories: ");
                        System.out.printf("%5.1f",totals[i][0]);
                        System.out.print(" Carbs: ");
                        System.out.printf("%5.1f",totals[i][1]);
                        System.out.print(" Protein: ");
                        System.out.printf("%5.1f",totals[i][2]);
                        System.out.print(" Fat: ");
                        System.out.printf("%5.1f",totals[i][3]);
                        System.out.print(" Fiber: ");
                        System.out.printf("%5.1f%n",totals[i][4]); }
        this.exit_or_close();                
        }
        
        public void veiwAverage() throws IOException{
            //this is identical to the total function
            double[][] Average = new double[linecount/15][5];
            int tmp = 0;

            for(int x = 0; x<linecount/15; x++){ //cycle through each day,
               
                for(int y = 0; y<linecount/15; y++){ //and every iteam in that day
                    tmp = tmp + 1;
                    Average[x][0] = Average[x][0] + Calories.get(tmp - 1);
                    Average[x][1] = Average[x][1] + Carbs.get(tmp - 1);
                    Average[x][2] = Average[x][2] + Protein.get(tmp - 1);
                    Average[x][3] = Average[x][3] + Fat.get(tmp - 1);
                    Average[x][4] = Average[x][4] + Fiber.get(tmp - 1);}
                    }
                  
            
                    //average all of them
                    for (int x = 0; x<7; x++){
                    Average[x][0] = Average[x][0] / 15;
                    Average[x][1] = Average[x][1] / 15;
                    Average[x][2] = Average[x][2] / 15;
                    Average[x][3] = Average[x][3] / 15;
                    Average[x][4] = Average[x][4] / 15; }
           
                   //Print everything out all nicely formatted
                   for (int i = 0; i<7; i++){
                   System.out.print ("the average amount of nutriants consumed on day " + (i+1) + " was  Calories: ");
                   System.out.printf("%5.1f",Average[i][0]);
                   System.out.print(" Carbs: ");
                   System.out.printf("%5.1f",Average[i][1]);
                   System.out.print(" Protein: ");
                   System.out.printf("%5.1f",Average[i][2]);
                   System.out.print(" Fat: ");
                   System.out.printf("%5.1f",Average[i][3]);
                   System.out.print(" Fiber: ");
                   System.out.printf("%5.1f%n",Average[i][4]); }
       this.exit_or_close();
        }
        
        public void veiwMost() throws IOException{
            
            double[][] totals  = new double[linecount/15][5];
           
            //this will store the day number in the first dimention, and the value in the second
            double[][] largest = new double[2][5];
            int tmp = 0;
            String[] Nutriants = {"Calories", "Carbs", "Protein", "Fat", "Fiber"};
            
            
            //cycle through each day,
            for(int x = 0; x<7; x++){
                //and every iteam in that day
                for(int y = 0; y<15; y++){
                    tmp = tmp + 1;
                    totals[x][0] = totals[x][0] + Calories.get(tmp - 1);
                    totals[x][1] = totals[x][1] + Carbs.get(tmp - 1);
                    totals[x][2] = totals[x][2] + Protein.get(tmp - 1);
                    totals[x][3] = totals[x][3] + Fat.get(tmp - 1);
                    totals[x][4] = totals[x][4] + Fiber.get(tmp - 1);}
                    }
                  
                        for(int z = 0; z < 7; z++){
                            if (totals[z][0] > largest[0][0]) {largest[0][0] = totals[z][0]; largest[1][0] = z;}
                            if (totals[z][1] > largest[0][1]) {largest[0][1] = totals[z][1]; largest[1][1] = z;}
                            if (totals[z][2] > largest[0][2]) {largest[0][2] = totals[z][2]; largest[1][2] = z;}
                            if (totals[z][3] > largest[0][3]) {largest[0][3] = totals[z][3]; largest[1][3] = z;}
                            if (totals[z][4] > largest[0][4]) {largest[0][4] = totals[z][4]; largest[1][4] = z;}
                              
                        }
            
            
                        for (int i = 0; i<5; i++){
                        System.out.printf ("the day the most amount of " + Nutriants[i]);
                        System.out.printf(" was consumed on day: ");
                        System.out.printf("%.0f",largest[1][i] + 1);
                        System.out.print(" at ");
                        System.out.printf("%.1f%n",largest[0][i]);
                        /*System.out.print(" ");
                        System.out.printf("%.1f",largest[0][i]);
                        System.out.println(Nutriants[i]); */
                        }
        this.exit_or_close();
        }
       
        public void veiwGood() throws IOException{
           String good_days;
           
                      double[] totals = new double[linecount/15];
            int tmp = 0;
            
            //cycle through each day,
            for(int x = 0; x<7; x++){
                //and every iteam in that day
                for(int y = 0; y<15; y++){
                    tmp = tmp + 1;
                    totals[x] = totals[x] + Calories.get(tmp - 1); }} 
            for(int y = 0;y<7; y++){
                if (totals[y] < 2000) {
                    System.out.println("Day: " +y+" " + "was under 2000 calories");
                } 
            }
       
        this.exit_or_close();
        }
        
        public void veiwLowCal() throws IOException{
            int running_total = 0;
            
            for(int x = 0; x<linecount; x++){
               if ((Calories.get(x)/Weight.get(x))<1){
                   running_total = running_total + 1;
               } 
            }
            System.out.println("You have consumed low density foods " + running_total + " times");
            this.exit_or_close();
        }
        
        
        
        public void parse(BufferedReader file) throws IOException{
            String line;
            String[] tmp;
   
            while ((line = file.readLine()) != null){// go through each line
              tmp = line.split("[ ]+"); //break up the string every " "
              
              //put the data into there arraylists.
              Day.add(Integer.parseInt(tmp[0])); //because tmp stores strings, we have to convert them to the different datatypes that we need.
              Name.add(tmp[1]);//but not this one, because it is a string
              Calories.add(Double.parseDouble(tmp[2]));
              Carbs.add(Double.parseDouble(tmp[3]));
              Protein.add(Double.parseDouble(tmp[4]));
              Fat.add(Double.parseDouble(tmp[5]));
              Fiber.add(Double.parseDouble(tmp[6]));
              Weight.add(Double.parseDouble(tmp[7]));
              linecount++; //create a line count, this is going to be used in several different places
              
              
              
            }
        }
        
		
		//this handles my selections then calls the corisponding methods
        public void menu_selection() throws IOException{
                
                System.out.println("Please enter your selection now.");    
                selection = console.next();
                
                switch (selection.toLowerCase()){ //get the information, set to lowercase and choose the correct function to call
                //ahh, how i love case statments...
                case "total":     this.veiwTotal();   break;
                case "average":   this.veiwAverage(); break;
                case "most":      this.veiwMost();    break;
                case "good":      this.veiwGood();    break;
                case "low":       this.veiwLowCal();  break;
                // if they made a selection that is not on that list, tell them so and try again.
		default: System.out.println("That was not a valid selection, please try again."); this.menu_selection(); break; //use recursion to restart the selection process,
        
        }       
        
        }
        
        public void exit_or_close() throws IOException{
            String selection = " ";
            System.out.println("Do you want to return to main menu, or exit the progam? type 'menu' or 'exit'");
            
            selection = console.next();
            if("menu".equals(selection.toLowerCase())){this.print_mainMenu(); this.menu_selection();}
            else if ("exit".equals(selection.toLowerCase())){this.exit();}
            else{
                System.out.println("that was not a valid selection, please try again");
                this.exit_or_close();
            }
                    
        }
        
        public void exit() throws IOException{
            reader.close();
            System.exit(0);
        }
        
  }   