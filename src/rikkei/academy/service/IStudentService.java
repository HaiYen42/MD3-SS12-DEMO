package rikkei.academy.service;

import rikkei.academy.modal.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();

   //Hàm thêm mới--> Ko trả về dữ liệu
    void save(Student student);

    // Hàm tìm kiếm trả  về Student thao tác theo id
    Student findById(int id);
    //Hàm xóa--> Ko trả về dữ liệu
    void deleteById(int id);

}