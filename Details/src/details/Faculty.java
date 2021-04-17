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
public class Faculty extends Employee{
    private String hours;
    private String subjects;

    public Faculty(String name,String hours, String subjects, String office, double salary, String date, String address, String phonenumber, String emailaddress) {
        super(name,office, salary, date, address, phonenumber, emailaddress);
        this.hours = hours;
        this.subjects = subjects;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Faculty{" +super.getName()+"hours=" + hours + ", subjects=" + subjects + '}';
    }
    
}
