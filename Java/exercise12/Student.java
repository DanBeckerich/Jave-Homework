//written by Daniel Beckerich on 4/29/2017
//this class is designed to hold information on a single student
//note this section is take right out of the book
package chap10exercise12;

public class Student extends Person {
    
    //define the variables
    private int sId;
    private int numberOfCourses;
    private boolean isTuitionPaid;
    private Course[] coursesEnrolled = new Course[6];
    
    private char[] courseGrades;
    private Person thisPerson = new Person();
    
    //collective set
    public void setInfo(String fName, String lName, int ID, int nOfCourses, boolean isTPaid, Course[] courses, char[] cGrades){
    thisPerson.setName(fName, lName);
    sId = ID;
    isTuitionPaid = isTPaid;
    numberOfCourses = nOfCourses;
    //deep copy of the course info and grades
    for (int i = 0; i < numberOfCourses; i++){
        coursesEnrolled[i].copyCourseInfo(courses[i]);
        courseGrades[i] = cGrades[i];
    }
    //sort the course list
    sortCourses();   
}
    //set methods
    public void setStudentId(int ID){
        sId = ID;
        
    }
    
    public void setIsTuitionPaid(boolean isTPaid){
        isTuitionPaid = isTPaid;
    }
    
    public void setNumberOfCourses(int nOfCourses){
        numberOfCourses = nOfCourses;
    }
    //set the list of courses enrolled in.
    public void setCoursesEnrolled(Course[] courses, char[] cGrades){
        for (int i = 0; i < numberOfCourses; i++){
            coursesEnrolled[i].copyCourseInfo(courses[i]);
            courseGrades[i] = cGrades[i];
        }
        //set the courses
        sortCourses();
        
    }
    
    public Student(){
        super();
        numberOfCourses = 0;
        sId = 0;
        isTuitionPaid = false;
        coursesEnrolled = new Course[6];
        
        for (int i = 0; i < 6; i++)
            coursesEnrolled[i] = new Course();
        
        courseGrades = new char[6];
        
        for (int i = 0; i < 6; i++)
            courseGrades[i] = '*';
    }
    
    @Override
    public String toString(){
        String gReport;
        
        gReport = "Student Name: " + thisPerson.toString() + "\r\n"
                + "Student ID: " + sId + "\r\n"
                + "Number of courses: " + numberOfCourses + "\r\n"
                + String.format("%-12s%-15s%-8s%-6s%n", "Course No", "Course Name", "Credits", "Grade");
        
        for (int i = 0; i < numberOfCourses; i++){
            gReport = gReport + coursesEnrolled[i];
            
            if (isTuitionPaid)
                gReport = gReport + String.format("%8s%n", courseGrades[i]);
        }
        
        return gReport;
    }
    
    public int getStudentId(){
        return sId;
    }
    
    public boolean getIsTuitionPaid(){
        return isTuitionPaid;
    }
    
    public int getNumberOfCourses(){
       return numberOfCourses; 
    }
    
    public Course getCourse(int i){
        Course temp = new Course();
        temp.copyCourseInfo(coursesEnrolled[i]);
        return temp;
    }
    
    public char getGrade(int i){
        return courseGrades[i];
    }
    
    
    private int getHoursEnrolled(){
        int totalCredits = 0;
        
        for (int i = 0; i < numberOfCourses; i++)
            totalCredits += coursesEnrolled[i].getCredits();
        
        return totalCredits;
    }
    
    public double billingAmount(double tuitionRate){
        return tuitionRate*getHoursEnrolled();
    }
    
    public double getGpa(){
        double sum = 0.0;
              
        for (int i = 0; i < numberOfCourses; i++){
            switch (courseGrades[i]){
                case 'A':
                    sum += coursesEnrolled[i].getCredits() * 4;
                    break;
                case 'B':
                    sum += coursesEnrolled[i].getCredits() * 3;
                    break;
                case 'C':
                    sum += coursesEnrolled[i].getCredits() * 2;
                    break;
                case 'D':
                    sum += coursesEnrolled[i].getCredits() * 1;
                    break;
                case 'F':
                    break;
                default:
                    System.out.println("Invalid Course Grade");
                    
            }
        }
        return sum/getHoursEnrolled();
    }
    
    private void sortCourses(){
        int minIndex;
        Course temp = new Course();
        String course1;
        String course2;
        
        char tempGrade;
        
        for (int i = 0; i< numberOfCourses - 1; i++){
            minIndex = i;
            
            for (int j = i + 1; j < numberOfCourses; j++){
                course1 = coursesEnrolled[minIndex].getCourseNumber();
                course2 = coursesEnrolled[j].getCourseNumber();
                
                if(course1.compareTo(course2) > 0)
                    minIndex = j;
               
                temp.copyCourseInfo(coursesEnrolled[minIndex]);
                coursesEnrolled[minIndex].copyCourseInfo(coursesEnrolled[i]);
                coursesEnrolled[i].copyCourseInfo(temp);
                
                tempGrade = courseGrades[minIndex];
                courseGrades[minIndex] = courseGrades[i];
                courseGrades[i] = tempGrade;
            }
            
            
        }
    }
 
Student(String fName, String lName, int ID, int nOfCourses, boolean isTPaid, Course[] courses, char[] cGrades){
    thisPerson.setName(fName, lName);
    sId = ID;
    isTuitionPaid = isTPaid;
    numberOfCourses = nOfCourses;
//deep copy of the course info and grades
    for (int i = 0; i < numberOfCourses; i++){
        coursesEnrolled[i].copyCourseInfo(courses[i]);
        courseGrades[i] = cGrades[i];
    }
    //sort the course list
    sortCourses();   
}
    
}
