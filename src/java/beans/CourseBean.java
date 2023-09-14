/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author t
 */
public class CourseBean {
    
    private String courseId;
    private String instructorId;
    private String courseName;
    private int unit;
    private String entryDate;

    public CourseBean() {
    }

    public CourseBean(String courseId, String instructorId, String courseName, int unit, String entryDate) {
        this.courseId = courseId;
        this.instructorId = instructorId;
        this.courseName = courseName;
        this.unit = unit;
        this.entryDate = entryDate;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "CourseBean{" + "courseId=" + courseId + ", instructorId=" + instructorId + ", courseName=" + courseName + ", unit=" + unit + ", entryDate=" + entryDate + '}';
    }
    
    
}
