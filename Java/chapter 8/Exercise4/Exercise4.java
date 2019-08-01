//written by Daniel Beckerich
//on 4/28/2017
//this program is for testing the Person object defined in Person.java

package Exercise4;


public class Exercise4 {

    public static void main(String[] args) {
        //get a few objects
        Person Daniel = new Person("Daniel","Jeremiah", "Beckerich");
        Person David = new Person("David", "Taylor");
        Person Brad = new Person("Brad","");
        Person ShapeShifter = new Person();
        
        //compair whether Daniel is equal to David
        System.out.print("Compairing Daniel and David.");
        System.out.print(" " + (Daniel.equals(David)));
        System.out.println();
        
        //setting Brads last name
        Brad.setLastName("Mc Durmont");
        
        //setting the shapeshifter to Daniel
        Daniel.makeCopy(ShapeShifter);
        
        //compairing Daniel and the Shapeshifter
        System.out.print("Compairing Daniel and the Shapeshifter.");
        System.out.print(" " + (Daniel.equals(ShapeShifter)));
        System.out.println();
    }
    
}
