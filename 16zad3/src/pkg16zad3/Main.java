/*
Napisz program, który, który wylos
uje 100 liczb całkowitych, a następnie wyświetli najmniejszą 
oraz największą z nich.
 */
package pkg16zad3;

import java.util.Random;

/**
 *
 * @author acer1
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();
        int max=0;
        int min=0;
        int liczba=0;
        for (int i = 0; i<100; i++){
            liczba = rand.nextInt(100);
            if (i==0){
                max = min = liczba;
            } 
            if (liczba>max){
                max = liczba;
            }
            if (liczba<min){
                min = liczba;
            }
            
        }
        System.out.println(max + " " + min);
    }
    
}
