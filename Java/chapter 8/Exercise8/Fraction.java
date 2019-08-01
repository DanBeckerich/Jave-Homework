/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise8;

/**
 *
 * @author Daniel
 */
public class Fraction {
    //declare the two variables
    private int numerator;
    private int denominator;
    
    //with both numbers
    Fraction(int num, int den){
        numerator = num;
        denominator = den;
    }
    
    //with no numbers.
    Fraction(){
        numerator = 0;
        denominator = 0;
    }
    
    @Override
    public String toString(){
        return (numerator+"/"+denominator);
    }
    
    //set and get methods
    public void setNumerator(int num){
        numerator = num;
    }
    
    public void setDenominator(int num){
        denominator = num;
    }
    
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    //implemintations for adding, subtraction, multiplication, and devision.
    public String add_S(int top, int bottom){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * bottom) + (top * this.denominator));
        Den1 = (this.denominator * bottom);
        
        return Num1 + "/" + Den1;
    }
        //the methods ending with _S return strings while _F return fraction objects
    public Fraction add_F(Fraction otherFraction){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * otherFraction.denominator) + (otherFraction.numerator * this.denominator));
        Den1 = (this.denominator * otherFraction.denominator);
        
        return new Fraction(Num1,Den1);
    }
       
        
//subtraction
    public String sub_S(int top, int bottom){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * bottom) - (top * this.denominator));
        Den1 = (this.denominator * bottom);
        
        return Num1 + "/" + Den1;
    }
   
        public Fraction sub_F(Fraction otherFraction){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * otherFraction.denominator) - (otherFraction.numerator * this.denominator));
        Den1 = (this.denominator * otherFraction.denominator);
        
        return new Fraction(Num1,Den1);
    }

    
       //maltiplication
    public Fraction mult_F(Fraction otherFraction){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * otherFraction.numerator));
        Den1 = (this.denominator * otherFraction.denominator);
        
        return new Fraction(Num1,Den1);
    }
    
        
        public String mult_S(int top, int bottom){
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * top));
        Den1 = (this.denominator * bottom);
        
        return Num1 + "/" + Den1;
        }
    //and  now devision    
    public Fraction div_F(Fraction otherFraction){
       //check to see if we are deviding by 0. because that is bad
        if( otherFraction.numerator == 0 || otherFraction.denominator == 0)
            return new Fraction(-0,-0);
        
        int Num1 = 0;
        int Den1 = 0;
        
        //the numerator first
        Num1 = ((this.numerator * otherFraction.denominator));
        Den1 = (this.denominator * otherFraction.numerator);
        
        return new Fraction(Num1,Den1);
    }
    
        
    public String div_S(int top, int bottom){
       //check to see if we are deviding by 0. because that is bad
        if( top == 0 || bottom == 0)
            return "-0/-0";
        
        int Num1 = 0;
        int Den1 = 0;

        //the numerator first
        Num1 = ((this.numerator * bottom));
        Den1 = (this.denominator * top);
        
        return Num1 + "/" + Den1;
        
    }
}