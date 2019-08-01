//Written by Daniel Beckerich
//on 4/28/2017
//for chapter 8 exercise 8
//this program is designed to test the class "frction" which implements
//mathmatical fractions
package exercise8;

public class Exercise8 {


    public static void main(String[] args) {
        //set the two fractions to there values
        Fraction frac1 = new Fraction(1,2);
        Fraction frac2 = new Fraction(3,4);
        
        System.out.println(frac1.toString() + " + " + frac2.toString() + " = " + frac1.add_F(frac2).toString());
        System.out.println(frac1.toString() + " - " + frac2.toString() + " = " + frac1.sub_F(frac2).toString());
        System.out.println(frac1.toString() + " * " + frac2.toString() + " = " + frac1.mult_F(frac2).toString());
        System.out.println(frac1.toString() + " / " + frac2.toString() + " = " + frac1.div_F(frac2).toString());
        
    }
    
}
