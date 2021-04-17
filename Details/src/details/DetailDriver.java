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
public class DetailDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person Pari = new Person("Pari", "1121 N College Drive Horizons West Apartments #5", "9139639213","S541670@nwmissouri.edu");
        System.out.println(Pari);
        Employee emp1 = new Employee("Harsha", "Cerner Corporation", 5000, "04/10/2021", "Overland Park Kansas City", "4705352763","harshathota@gmail.com");
        System.out.println(emp1);
        Faculty faculty1= new Faculty("Dr.Alex","20", "5", "MS-ACS",2000, "03/10/2021", "Missouri Maryville City", "912219222", "alex@gmail.com");
        System.out.println(faculty1);
        Staff staff1 = new Staff("Anny Baker", "MS-IS", 3000,"02/12/2021", "Kansas Luxury Apartments", "610320555", "annybaker@gmail.com"); 
        System.out.println(staff1);
        
    }
    
}
