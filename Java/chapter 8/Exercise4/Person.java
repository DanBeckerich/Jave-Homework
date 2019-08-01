
package Exercise4;

public class Person {
    //declare private variables
   private String firstName;
   private String lastName;
   private String middleName;
   
   //blank constructor
   public Person(){
       firstName = "";
       lastName = "";
       middleName = "";
   }
   //constructor that sets the first and last name
  public Person(String first, String last){
      setName(first,last);
  } 
  
  public Person(String first, String middle, String last){
      setName(first,middle,last);
  }
  
  //copy constructor.
  public Person(Person object){
      this.firstName = object.firstName;
      this.middleName = object.middleName;
      this.lastName = object.lastName;
  }
  
  //override the tostring() method
  @Override
  public String toString(){
      if (middleName.equals(""))
        return (firstName + " " + lastName);     
      else
        return (firstName + " " + middleName + " " + lastName);
  }
  
  //set and get methods for firstname, lastname, and middlename to ""
  public void setName(String first, String last){
      firstName = first;
      lastName = last;
      middleName = "";
  }
  //same thing, just setting the middle name to a given string.
  public void setName(String first, String last, String middle){
      firstName = first;
      lastName = last;
      middleName = middle;
  }
  
  public void setFirstName(String first){
      firstName = first;
  }
  
  public void setLastName(String last){
      lastName = last;
  }
  
  public void setMiddleName(String middle){
      middleName = middle;
  }
  
  public String getFirstName(){
      return firstName;
  }
  
  public String getLastName(){
      return lastName;
  }
  
  public String getMiddleName(){
      return middleName;
  }
  
  //check methods
  public Boolean checkFirstName(String name){
       return firstName.equals(name);    
  }
  
  public Boolean checkLastName(String name){
      return lastName.equals(name);
  }
  
  public Boolean checkMiddleName(String name){
      return middleName.equals(name);
  }
  
//.equils definition
   public boolean equals(Person object){
       // not needed. i was trying to make it so you could pass any object in
       //and it would return false if its not a 'person' object
       //i couldnt get the return statement working though, so i dont need this anymore
       
       //if (!(object instanceof Person)) 
       //     return false;
        
        return (firstName.equals(object.getFirstName()) && middleName.equals(object.getMiddleName()) && lastName.equals(object.getLastName()));
       //return (this.toString.equals(object.toString));
}
 
   //sets the supplied object equal to itself
   //NOTE: this is the reverse of how the book does it.
   //this makes more sense to me given the name 'makeCopy'
   //it does the same thing, just backwards.
   //maybe it would make more sense if it were called 'copyInto'
   public void makeCopy(Person object){
       object.firstName = this.firstName;
       object.middleName = this.middleName;
       object.lastName = this.lastName;
   }
   
   //returns an instince of person with the same first name, middle name, and last name.
   public Person getCopy(){
       Person temp = new Person();
       
       temp.firstName = this.firstName;
       temp.middleName = this.middleName;
       temp.lastName = this.lastName;
       
       return temp;
   }


}
