package mvcPractice.mid.courseRegistration.repository;


import mvcPractice.mid.courseRegistration.model.Course;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {
    private Map<String, Course> courseMap = new HashMap<>();

    public void addCourse(Course course){
        courseMap.put(course.getCourseCode(),course);
    }
    public Course getCourse(String code){
        return courseMap.get(code);
    }
    public boolean exists(String code){
        return courseMap.containsKey(code);
    }
    public Collection<Course> getAllCourses(){
        return courseMap.values();
    }

}
