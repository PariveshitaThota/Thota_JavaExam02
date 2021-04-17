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
public class Staff extends Employee{
    private String title;

    public Staff(String name,String office, double salary, String date, String address, String phonenumber, String emailaddress) {
        super(name,office, salary, date, address, phonenumber, emailaddress);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff{" + super.getName()+"title=" + title + '}';
    }
    
}
