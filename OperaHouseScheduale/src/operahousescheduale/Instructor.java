/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operahousescheduale;

/**
 *
 * @author Yasmine
 */

// This class for thr instructors that will taught the courses.
public class Instructor {
     private int InstructorID;
    private String InstructorName;
    
    
     //  Default Constructor
    public Instructor() {
    }
    
    // overLoaded constractor to inilize the variables.
    public Instructor(int InstructorID, String InstructorName) {
        this.InstructorID = InstructorID;
        this.InstructorName = InstructorName;
    }

    // The getters and the setters 
    public int getInstructorID() {
        return InstructorID;
    }

    public void setInstructorID(int InstructorID) {
        this.InstructorID = InstructorID;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String InstructorName) {
        this.InstructorName = InstructorName;
    }
    
    
}
