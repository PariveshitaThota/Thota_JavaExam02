/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author Pariveshita Thota
 */
public abstract class HondaActiva {
    HondaActiva()
    {
        System.out.println("hondaactiva is created");}
      public  abstract void run();
      public  void changeGear(){
        System.out.println("gear changed");
    }
    

}
