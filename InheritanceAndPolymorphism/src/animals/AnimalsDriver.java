/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Pariveshita Thota
 */
public class AnimalsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal lion = new Lion();
        lion.getType();
        
        Animal deer = new Deer();
        deer.getType();
         Animal deer1 = new Lion();
         deer1.getType();
        
        
        
    }
    
}
