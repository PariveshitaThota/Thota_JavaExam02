/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planets;

/**
 *
 * @author Pariveshita Thota
 */
public class PlanetsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(Planets plan: Planets.values()) {
         System.out.println(plan);
    }
    
    }
}