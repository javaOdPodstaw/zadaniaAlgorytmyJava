/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Napisz program obliczający iloczyn elementówtablicy dwuwymiarowej
 */
package java20_2;

import java.util.*;

public class Java20_2 {

    static int[][] tablica = new int[10][3];

    public static void main(String[] args) {
        // System.out.println(tablica.length);
        // System.out.println(tablica[0].length);
        uzup();
        pom();
    }

    static void uzup() {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                tablica[i][j] = r.nextInt(10) + 1;
            System.out.print(tablica[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    static void pom() {
        int ilocz = 1;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                ilocz = ilocz * tablica[i][j];
            }
        }
        System.out.println(ilocz);
    }
}
