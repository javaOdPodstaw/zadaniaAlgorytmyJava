/*
 Napisz program, w którym zostanie utworzona 100-
elementowa tablica liczb typu int. Komórkom o 
indeksach 0, 10, 20, ..., 90 przypisz wartość 0, komórkom 1, 11, 21, ..., 91 wartość 1, komórkom 2, 12, 
22, ..., 92 wartość 2 itd
 */
package zad.pkg4;


public class Zad4 {

  
    public static void main(String[] args) {
       int[] table = new int[100];
       int i;
       
        for ( i = 0; i < 100; i++) {
           table[i]=i%10;
            System.out.println(table[i]);
        }
    }
    
}
