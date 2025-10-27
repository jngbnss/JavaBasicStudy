package mvcExample.mid.courseRegistration;


import mvcExample.mid.courseRegistration.controller.EnrollmentController;
import mvcExample.mid.courseRegistration.repository.CourseRepository;
import mvcExample.mid.courseRegistration.repository.StudentRepository;
import mvcExample.mid.courseRegistration.view.view;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        CourseRepository courseRepository = new CourseRepository();
        view view = new view();
        EnrollmentController controller = new EnrollmentController(studentRepository, courseRepository, view);
        controller.run();
    }
}