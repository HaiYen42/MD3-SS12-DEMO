package rikkei.academy.service;

import rikkei.academy.modal.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService {
    public static List<Student> studentList= new ArrayList<>();
    // Khởi tạo biến static thông qua khối Static
    static {
        studentList.add(new Student(1, "Ha", 5));
        studentList.add(new Student(2, "Son Do", 4));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    //Hàm thêm mới sinh viên--> add student vào studentList.
    public void save(Student student) {
        studentList.add(student);
    }

    @Override
    //get(i)--> lấy 1 đối tượng. getId--> lấy id của đối tượng đó
    public Student findById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id) {
                //trả về 1 đối tượng student
                return studentList.get(i);
            }
        }
        //Ko tồn tại-->return null
        return null;
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId()==id) {
                studentList.remove(i);
            }
        }
    }
}
