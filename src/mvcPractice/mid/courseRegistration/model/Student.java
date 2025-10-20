package mvcPractice.mid.courseRegistration.model;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private int grade;
    private List<Course> registeredCourses = new ArrayList<>();

    public Student(String studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public List<Course> getRegisteredCourses() {
        return registeredCourses;
    }

    public void addCourse(Course course){
        registeredCourses.add(course);
    }

    public void removeCourse(Course course){
        registeredCourses.remove(course);
    }

    public boolean hasCourse(String courseCode){
        return registeredCourses.stream().anyMatch(c->c.getCourseCode().equals(courseCode));

    }

    @Override
    public String toString() {
        return String.format("[%s]%s(%d학년)",studentId,name,grade);
    }
}

