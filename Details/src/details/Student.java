/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package details;

/**
 *
 * @author Pariveshita Thota
 */
public class Student extends Person {
    private String grade;
    private String class_status;

    public Student(String name,String grade, String class_status, String address, String phonenumber, String emailaddress) {
        super(name, address, phonenumber, emailaddress);
        this.grade = grade;
        this.class_status = class_status;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClass_status() {
        return class_status;
    }

    public void setClass_status(String class_status) {
        this.class_status = class_status;
    }

    @Override
    public String toString() {
        return "Student{" +super.getName()+ "grade=" + grade + ", class_status=" + class_status + '}';
    }
    

}