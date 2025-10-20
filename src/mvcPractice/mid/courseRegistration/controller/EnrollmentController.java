package mvcPractice.mid.courseRegistration.controller;

import mvcPractice.mid.courseRegistration.model.Course;
import mvcPractice.mid.courseRegistration.model.Student;
import mvcPractice.mid.courseRegistration.repository.CourseRepository;
import mvcPractice.mid.courseRegistration.repository.StudentRepository;
import mvcPractice.mid.courseRegistration.view.view;

import java.util.Collection;

public class EnrollmentController {
    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private view view;

    public EnrollmentController(StudentRepository studentRepository, CourseRepository courseRepository, view view) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
        this.view = view;
    }

    public void run(){
        while (true){
            view.showMenu();
            String choice = view.input("");
            switch (choice){
                case "1": registerStudent(); break;
                case "2": viewStudent(); break;
                case "3": registerCourse(); break;
                case "4": viewCourses(); break;
                case "5": enrollCourse(); break;
                case "6": cancelCourse(); break;
                case "7": showTimetable(); break;
                case "0": view.print("종료합니다."); return;
                default: view.print("잘못된 입력입니다.");

            }
        }
    }

    private void registerStudent() {
        String id = view.input("학번: ");
        if(studentRepository.exists(id)){
            view.print("이미 등록된 학번입니다.");
            return;
        }
        String name = view.input("이름 : ");
        int grade = Integer.parseInt(view.input("학년 : "));
        studentRepository.addStudent(new Student(id,name,grade));
        view.print("학생 등록 완료!");
    }
    //
    private void viewStudent() {
        String id = view.input("조회할 학번: ");
        Student s = studentRepository.getStudent(id);
        if (s == null) {
            view.print("존재하지 않는 학생입니다.");
            return;
        }
        view.print(s.toString());
        if (s.getRegisteredCourses().isEmpty()) {
            view.print("수강 과목 없음");
        } else {
            for (Course c : s.getRegisteredCourses())
                view.print(" - " + c);
        }
    }

    private void registerCourse() {
        String code = view.input("과목 코드: ");
        if (courseRepository.exists(code)) {
            view.print("이미 등록된 과목 코드입니다.");
            return;
        }
        String name = view.input("과목명: ");
        String prof = view.input("교수명: ");
        String day = view.input("요일: ");
        String time = view.input("시간(예: 10:00-12:00): ");
        courseRepository.addCourse(new Course(code, name, prof, day, time));
        view.print("과목 등록 완료!");
    }

    private void viewCourses() {
        Collection<Course> list = courseRepository.getAllCourses();
        if (list.isEmpty()) view.print("등록된 과목이 없습니다.");
        else list.forEach(c -> view.print(" - " + c));
    }

    private void enrollCourse() {
        String id = view.input("학번: ");
        Student s = studentRepository.getStudent(id);
        if (s == null) {
            view.print("존재하지 않는 학생입니다.");
            return;
        }

        String code = view.input("수강할 과목 코드: ");
        Course c = courseRepository.getCourse(code);
        if (c == null) {
            view.print("존재하지 않는 과목입니다.");
            return;
        }

        if (s.hasCourse(code)) {
            view.print("이미 수강 중인 과목입니다.");
            return;
        }

        for (Course course : s.getRegisteredCourses()) {
            if (course.getDay().equals(c.getDay()) && course.getTime().equals(c.getTime())) {
                view.print("시간표 충돌! 수강 불가.");
                return;
            }
        }

        s.addCourse(c);
        view.print("수강 신청 완료!");
    }

    private void cancelCourse() {
        String id = view.input("학번: ");
        Student s = studentRepository.getStudent(id);
        if (s == null) {
            view.print("존재하지 않는 학생입니다.");
            return;
        }

        String code = view.input("취소할 과목 코드: ");
        if (!s.hasCourse(code)) {
            view.print("수강 중인 과목이 아닙니다.");
            return;
        }

        Course c = courseRepository.getCourse(code);
        s.removeCourse(c);
        view.print("수강 취소 완료!");
    }

    private void showTimetable() {
        String id = view.input("학번: ");
        Student s = studentRepository.getStudent(id);
        if (s == null) {
            view.print("존재하지 않는 학생입니다.");
            return;
        }
        view.print("\n==== " + s.getName() + "의 시간표 ====");
        for (Course c : s.getRegisteredCourses()) {
            view.print(c.getDay() + " " + c.getTime() + " -> " + c.getCourseName());
        }
    }
}




