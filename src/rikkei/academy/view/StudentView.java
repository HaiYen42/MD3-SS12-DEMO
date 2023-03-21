package rikkei.academy.view;

import rikkei.academy.config.Config;
import rikkei.academy.controller.StudentController;
import rikkei.academy.modal.Student;

import java.sql.SQLOutput;
import java.util.List;

public class StudentView {
    StudentController studentController = new StudentController();
    public void showTableStudent(){
        System.out.println("******************STUDENT MANAGER******************");
        List<Student> studentList = studentController.showListStudent();
        System.out.println("====ID====NAME====AGE======");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(" "+ studentList.get(i).getId()+ " "+ studentList.get(i).getName()+ " "+ studentList.get(i).getAge());
        }
        System.out.println("Enter quit to comeback Menu ");
        String backMenu = Config.scanner().nextLine();
        if (backMenu.equalsIgnoreCase("quit")) {
            new Main();
        }
    }
    public void createStudentForm(){
        while (true){
            //lấy id cuối cùng + 1;
            int id = studentController.showListStudent().get(studentController.showListStudent().size()-1).getId()+1;
            System.out.println("Enter the name: ");
            String name = Config.scanner().nextLine();
            System.out.println("Enter the age: ");
            int age= Config.scanner().nextInt();
            //Sau khi nhập xong thông tin--> Tạo ra 1 đối tượng student--> truyền các trường (id, name, age)
            Student student = new Student(id, name, age);
            // Làm việc với backend thông qua controller
            studentController.createStudent(student);
            System.out.println("Create success ! ");
            System.out.println("Enter quit to comeback Menu ");
            String backMenu = Config.scanner().nextLine();
            //Hàm equalsIgnoreCase : So sánh bằng chuỗi, ko phân biệt chữ hoa và thường
            if (backMenu.equalsIgnoreCase("quit")) {
                new Main();
                break;
            }
        }
    }
}
