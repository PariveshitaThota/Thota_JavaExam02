/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Pariveshita Thota
 */
public class CompareTwoDArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list1[][] = new int[3][3];
        System.out.print("Enter list1: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list1[i][j] = sc.nextInt();
            }
        }
        int list2[][] = new int[3][3];
        System.out.print("Enter list2: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list2[i][j] = sc.nextInt();
            }
        }
        if (equals(list1, list2)) {
            System.out.println("The two arrays are strictly identical");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

    public static boolean equals(int[][] m1, int[][] m2) {
        return Arrays.deepEquals(m1, m2);
    }
}
