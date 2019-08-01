//written by Daniel Beckerich on 5/4/2017
//this class implements the 'cource' class on p692
package chap10exercise12;

public class Course {
    
    //define the needed variables
    private String courseName;
    private String courseNo;
    private int courseCredits;
    
    
    //set methods
    public void setCourseInfo(String cName, String cNo, int credits){
        courseName = cName;
        courseNo = cNo;
        courseCredits = credits;
    }
    
    public void setCorseName(String cName){
        courseName = cName;
    }
    
    public void setCourseNumber(String cNo){
        courseNo = cNo;
    }
    
    public void setCourseCredis(int credits){
        courseCredits = credits;
    }
    
    //set the toString method so that it will return the correct information
    @Override
    public String toString(){
        return (courseName + " " + courseNo + " " + courseCredits);
    }
    
    //get methods
    public String getCourseName(){
        return courseName;
    }
    
    public String getCourseNumber(){
        return courseNo;
    }
    
    public int getCredits(){
        return courseCredits;
    }
    
    //make the current insence a copy of a given object
    public void copyCourseInfo(Course otherCourse){
        this.courseName = otherCourse.courseName;
        this.courseCredits = otherCourse.courseCredits;
        this.courseNo = otherCourse.courseNo;
    }
    
    
    //lastly the two constructors
    public Course(){
        courseName = "";
        courseCredits = 0;
        courseNo = "";
    }
    
    public Course(String cName, String cNo, int credits){
        courseName = cName;
        courseCredits = credits;
        courseNo = cNo;
    }
}
