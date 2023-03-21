package rikkei.academy.controller;

import rikkei.academy.modal.Student;
import rikkei.academy.service.IStudentService;
import rikkei.academy.service.StudentServiceIMPL;

import java.util.List;

public class StudentController {
    IStudentService studentService = new StudentServiceIMPL();
    public List<Student> showListStudent(){
        return studentService.findAll();
    }

    //Hàm create student hứng 1 đối tượng Student trên view & có tham số là student
    //Làm việc với service để save lại student
    public void createStudent(Student student){
        studentService.save(student);
    }
}
