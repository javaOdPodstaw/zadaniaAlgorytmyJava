/*
1. Napisz program sumujący elementy podzielne przez 7 
tablicy dwuwymiarowej
 */
package pkg20zad1;

import java.util.Random;


public class Main {

    static int[][] tablica = new int[50][50];

    public static void main(String[] args) {
        
    uzupelnij();
    wyswietl();
    System.out.println(zwroc());
    int a = zwroc();
    int c = a%7;
    System.out.println(c);
    
    }

    static void uzupelnij() {
        Random r = new Random();
        for (int i = 0; i < tablica.length; i++){
            for (int j=0; j< tablica[0].length; j++){
                tablica[i][j]= r.nextInt(100)+1;
            }   
        }
    }
    
    static void wyswietl(){
        for (int i = 0; i < tablica.length; i++){
            for (int j=0; j< tablica[0].length; j++){
                System.out.print(tablica[i][j]+ " ");
                if (tablica[0].length-1==j){
                    System.out.print("\n");
                }
            }
        }  
    } 
    
    static int zwroc(){
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            for (int j=0; j< tablica[0].length; j++){
                if(tablica[i][j]%7==0){
                    suma+=tablica[i][j];
                }
            }
        }
    return suma;
    }
}   
