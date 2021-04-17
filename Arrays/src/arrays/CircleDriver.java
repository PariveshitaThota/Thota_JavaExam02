/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
  import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author Pariveshita Thota
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
		// Create an array list of objects
		ArrayList<Object> o = new ArrayList<>();
		o.add(new Loan());		
		o.add(new Date());		
        boolean add = o.add("String class");	
		o.add(new Circle());	

		// Display all the elements in the list by 
		// invoking the object’s toString() method
		for (int i = 0; i < o.size(); i++) {
			System.out.println((o.get(i)).toString());
		}
	}
}
    
    
