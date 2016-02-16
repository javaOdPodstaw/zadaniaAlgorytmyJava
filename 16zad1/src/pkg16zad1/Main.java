
package pkg16zad1;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        double hajs = 0;
        double proc = 1024;
        double wynik = 0;
        int rok = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kwotę:");
        //To jest po to, żeby wpisać tylko liczby, bo inaczej wyświetli ten komunikat!//
        while(!sc.hasNextDouble()){
            System.out.println("Podaj prawidłowa ilosc pieniedzy!");
            sc.next();
        }
        hajs = sc.nextDouble();
       System.out.println("Podaj liczbę lat:");
       //To jest po to, żeby wpisać tylko liczby, bo inaczej wyświetli ten komunikat!//
       while(!sc.hasNextInt()){
            System.out.println("Podaj prawidłowa liczbe lat!");
            sc.next();
        }
        rok = sc.nextInt();
        //Pętla licząca zyska po ilości lat//
        for (i = 0; i < rok; i++) {
            hajs=hajs*proc;
        }
        System.out.printf("%.2f", hajs);
            
    }
    
}
