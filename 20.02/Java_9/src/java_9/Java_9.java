/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_9;

import java.util.*;

/**
 *
 * @author acer1
 */
public class Java_9 {

    static int liczba = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        wpro();
        spra();
    }

    static void wpro() {
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Podaj liczbę, ciołku!");
            sc.next();
        }
        liczba = sc.nextInt();

        System.out.println(liczba);
    }

    static boolean spra() {

        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                System.out.println(liczba + " nie jest liczba pierwsza.");
                return false;
            }

        }
        System.out.println(liczba + " jest liczba pierwsza.");
        return true;
        

    }

}
