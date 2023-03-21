package rikkei.academy.view;

import rikkei.academy.config.Config;

import java.sql.SQLOutput;

public class Main {
    public Main(){
        System.out.println("**********************STUDENT MANAGER*********************");
        System.out.println("1. Show List Student ");
        System.out.println("2. Create Student ");
        System.out.println("3. Update Student ");
        System.out.println("4. Delete Student ");
        System.out.println("5. Sort Student By Name ");
        int chooseMenu = Config.scanner().nextInt();
        switch (chooseMenu) {
            case 1:
                new StudentView().showTableStudent();
                break;
            case 2:
                new StudentView().createStudentForm();
                break;
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}