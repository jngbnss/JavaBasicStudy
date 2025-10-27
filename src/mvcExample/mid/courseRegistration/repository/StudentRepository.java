package mvcExample.mid.courseRegistration.repository;

import mvcExample.mid.courseRegistration.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRepository {
    private Map<String, Student> studentMap = new HashMap<>();

    public void addStudent(Student student){
        studentMap.put(student.getStudentId(),student);
    }
    public Student getStudent(String id){
        return studentMap.get(id);
    }
    public boolean exists(String id){
        return studentMap.containsKey(id);
    }
}
