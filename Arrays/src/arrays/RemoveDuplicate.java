/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pariveshita Thota
 */
public class RemoveDuplicate {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> input = new ArrayList<>();
        for(int i=0; i < 10; i++) {
            input.add(sc.nextInt());
        }
        removeDuplicate(input);
    }
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> newlist = new ArrayList<>();
        for(int element : list) {
            if (!newlist.contains(element)) {
                newlist.add(element);
            }
        }
        String output = "The distinct integers are";
        for(int i : newlist) {
            output = output + " " + i;
        }
        System.out.println(output);
    }
}
