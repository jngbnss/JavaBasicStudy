package mvcPractice.mid.courseRegistration;


import mvcPractice.mid.courseRegistration.controller.EnrollmentController;
import mvcPractice.mid.courseRegistration.repository.CourseRepository;
import mvcPractice.mid.courseRegistration.repository.StudentRepository;
import mvcPractice.mid.courseRegistration.view.view;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        CourseRepository courseRepository = new CourseRepository();
        view view = new view();
        EnrollmentController controller = new EnrollmentController(studentRepository, courseRepository, view);
        controller.run();
    }
}