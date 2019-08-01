//Written by Daniel Beckerich on 4/29/2017
//this class is designed to store information regarding student data, grading information, 

package chap10exercise12;

import java.util.Vector;


public class StudentList extends Student {
    //
    private Vector<Student> studentList;
    private int numberOfStudents;
    private double tuitionRate;
    
    //an empty constructor
    StudentList(){
        
        studentList = new Vector<Student>(0);
        numberOfStudents = 0;
        tuitionRate = 0.0;
        
    }
    
    //a constructor that gets populated by an array
    StudentList(StudentList[] SL){
        studentList.copyInto(SL);
        //make sure that the vector is the correct size
        studentList.trimToSize();
    }
    
    //a constructor that copys a given vector
    StudentList(Vector<Student> studentVector){
        
        for(int i = 0; i < studentVector.size(); i++){
            studentList.add(studentVector.get(i));
             //make sure that the vector is the correct size
            studentList.trimToSize();
        }
        
    }
    //because the studentList has allready been created we do not need to trim
    public void addStudent(Student newStudent){
        studentList.add(newStudent);
        studentList.trimToSize();
    }
    //remove a student with a specified sID number from the list
    public void removeStudent(int id){
        for (int i = 0; i < studentList.capacity(); i++)
            if (studentList.get(i).getStudentId() == id)
                studentList.remove(i);
                studentList.trimToSize();  
    }
    //get the number of students in the class
    public int getNumberOfStudents(){
        return studentList.capacity();
    }
    //print the information of each student
    public void printInfo(){
        for (int  i = 0; i < studentList.capacity(); i++ )
            System.out.println(studentList.get(i).toString());
    }
    
}
