//written by Daniel Beckerich
//on 4/29/2017
//this program is designed to test the class StudentList

package chap10exercise12;

public class Chap10exercise12 {

    public static void main(String[] args) {
        //define a few variables.
        StudentList class1 = new StudentList();
        Course[] DanielsCourses = { new Course("C++", "CS 217", 4),         new Course("Java","CS 241", 4),        new Course("College Algebra", "MTH 112", 4)};
        Course[] MarskCourses   = { new Course("Adv C++", "CS 317", 4),     new Course("testclass 1","CS 241", 4), new Course("testclass3", "MTH 112", 4)};
        Course[] JonsCourses    = { new Course("TestClass5", "CS 217", 4),  new Course("TestClass6","CS 241", 4),  new Course("TestClass7", "MTH 112", 4)};
        
        //add a few students to the list
        class1.addStudent(new Student("Daniel", "Beckerich", 1, 3, true, DanielsCourses, new char[]{'A','B','C'}   )    );
        class1.addStudent(new Student(  "Mark", "Beckerich", 2, 3, true, MarskCourses,   new char[]{'A','B','C'}   )    );
        class1.addStudent(new Student(   "Jon", "Beckerich", 3, 3, true, JonsCourses,    new char[]{'A','B','C'}   )    );
        
        //print the information to the console
        
            class1.printInfo();
    }
    
}
