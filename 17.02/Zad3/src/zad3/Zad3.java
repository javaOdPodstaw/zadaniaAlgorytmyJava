/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

/**
 *
 * @author acer1
 */
public class Zad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Napisz program, w którym zostanie utworzona 20
//-
//elementowa tablica typu boolean. Komórkom o 
//indeksie parzystym przypisz wartość true, a o indeksie nieparzystym 
//—
//false (zero możesz uznać za 
//wartość parzystą). Zawartość tablicy wyświetl na ekranie
        boolean[] table = new boolean[20];
        int i;
        for (i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                table[i] = true;
            } else if (i % 2 != 0) {
                table[i] = false;
            }
            System.out.println(table[i]);
        }

    }
}
