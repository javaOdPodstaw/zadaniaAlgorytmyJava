/*
 6. Napisz program znajdujący minimalny element tablicy dwuwymiarowej
 */
package java20_6;

import java.util.*;

public class Java20_6 {

    static int[][] tablica = new int[2][2];

    public static void main(String[] args) {
        wypelnijTabele();
        min();
    }

    static void wypelnijTabele() {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                tablica[i][j] = r.nextInt(10)+1;
                System.out.print(tablica[i][j] + " ");      
            }
            System.out.println(" ");
        } 
        
    }
    static void min() {
        int min = tablica[0][0];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
               if(min>tablica[i][j]) {
                   min = tablica[i][j];
               } 
            }   
        }
        System.out.println(min);
    }
    

}
