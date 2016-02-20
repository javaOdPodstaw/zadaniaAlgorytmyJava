
package max;

import java.util.*;
public class Max {

    static int [][] tablica = new int[3][3]; 
    public static void main(String[] args) {
        wypelnijTabele();
        max();
    }
    static void wypelnijTabele() {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = r.nextInt(10)+1;
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    static void max(){
        int max = tablica[0][0];
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                if(max < tablica[i][j]){
                    max = tablica[i][j];
                }
            }
            
        }
        System.out.println(max);
    }
    
}
