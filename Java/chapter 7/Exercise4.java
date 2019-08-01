//written by Daniel Beckerich
//on 4/16/2017 5:07PM
//this progtam is written to complete the chapter 7 programming exercise 4.

//import this because we will use it for testing.
import java.util.concurrent.ThreadLocalRandom;

public class ProgrammingExerciseChap7num4 {

    public static void main(String[] args) {
        
        int min = 0;
        int max = 100;
        
        int val1 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int val2 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int val3 = ThreadLocalRandom.current().nextInt(min, max + 1);
        int val4 = ThreadLocalRandom.current().nextInt(min, max + 1);
        
        System.out.println("the values for the function 'one' are " + val1 + " and " + val2);
        System.out.println("the function returned: " + one(val1,val2));
        System.out.println("the values for the function 'two' are " + val3 + " and " + val4);
        System.out.println("the function returned: " + one(val3,val4));
        
        
        
        
    }
    
    public static int one(int x, int y){
        
        if (x > y)
            return x + y;
        else
            return (x - (2 * y));
    }
    
    public static double two(int x, double a){
        int first;
        double z;
        
        z = a;       
        z = z + a;
        
        first = one(6,8);
        
        first = first + x;
        
        if (z > (first * 2))
            return z;
        else
            return ((first * 2) - z);
    }
    
}
