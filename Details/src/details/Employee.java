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
public class Employee  extends Person{
    private String office;
    private double salary;
    private String date;

    public Employee(String name,String office, double salary, String date, String address, String phonenumber, String emailaddress) {
        super(name,address, phonenumber, emailaddress);
        this.office = office;
        this.salary = salary;
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +super.getName()+"\n "+"office=" + office +"\n  salary=" + salary +"\n date=" + date + '}';
    }

}
