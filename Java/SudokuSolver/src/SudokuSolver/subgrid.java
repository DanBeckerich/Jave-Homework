//witten by Daniel Beckerich
//file created on 5/6/2017
//this class implements a 3x3 grid to be used for each sub grid

package SudokuSolver;

import java.util.Vector;
import java.util.Arrays;

public class subgrid {
    //each grid starts with a 3x3 array
      private int gridVal[][] = new int[3][3];
      
      //copy constructor
      subgrid(int[][] newGrid){
          for (int i = 0; i < 3; i++)
              for (int x = 0; i < 3; i++)
                  gridVal[i][x] = newGrid[i][x];
      }
      //blank constructor
      subgrid(){
             int[][] answerKey = new int[][] 
                                {{0,0,0},
                                 {0,0,0},
                                 {0,0,0}};
      }
      
      public void setGridVal(int x, int y, int val){
            gridVal[x][y] = val;
      }
      
      public int getGridVal(int x, int y){
           return gridVal[x][y];
      }
    
      //this method will check to see if the rid is solved or not.
      public boolean checkGrid(){
          int[][] answerKey = new int[][] 
                                {{1,2,3},
                                 {4,5,6},
                                 {7,8,9}};
          int firstCheck = 0;

          //first, a quick check to see if all of the cells add to 45. i.e. 1+2...+9 = 45          
          //add up all the cells
          for (int i = 0; i < 3; i++)
              for (int x = 0; i < 3; i++)
                  firstCheck += gridVal[i][x];
          //now check to see if they are equile 45.
          if (firstCheck != 45)
              //if not, break out of the method now and skip the next part.
              return false;
          
          //if we need to continue, create a clone of the original array, sort it, and see if it is equal to the completed grid
          int tempGridVal[][] = gridVal.clone();
          Arrays.sort(tempGridVal);
          return Arrays.equals(tempGridVal, answerKey);

      }
      
      public Vector solveGrid(){
          System.out.println("SOLVE GRIDS");
          return new Vector();
      }
   }