package mvcExample.mid.courseRegistration.model;

public class Course {
    private String courseCode;
    private String courseName;
    private String professor;
    private String day;
    private String time; // ex)"10:00 -12:00

    public Course(String courseCode, String courseName, String professor, String day, String time) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.professor = professor;
        this.day = day;
        this.time = time;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getProfessor() {
        return professor;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return String.format("[%s] %s / %s교수 / %s %s",
                courseCode, courseName, professor, day, time);
    }

}
