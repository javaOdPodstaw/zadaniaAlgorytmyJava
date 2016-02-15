/*
6. Napisz program drukujący po losowych 10 liczb:
a) Liczby typu int
b) Liczby typu float
c) Liczby typu int z zakresu [0, n) (wczytaj n)
*/

package zad6;

import java.util.Random;

public class Zad6 {

    public static void main(String[] args) {
        int i;
        // tworzymy nowa instancje obiektu typu Random
        Random r = new Random();
        
        // konstruujemy petle for, dla 10 wykonan
        for( i = 0; i < 10; i++) {
            // r.nextInt() - wywolujemy losowa wartosc typu int za pomoca metody nextInt(), instacji r obiektu Random
            System.out.println(r.nextInt());
        }
        
        for( i = 0; i < 10; i++) {
            // sytuacja analogiczna do powyzszej, z uzyciem wartosci zmiennoprzecinkowej
            // zwrocmy uwage na liczba, ktore sa zwracane (naleza do przedzialu 0,1);
            System.out.println(r.nextFloat());
        }
        
        int poczatek = 20, koniec = 100;
        
        // sposob na wygenerowanie liczb calkowitych z zadanego zakresu tj. <poczatek, koniec>
        for( i = 0; i < 10; i++) {
            System.out.println(r.nextInt(koniec - poczatek) + poczatek);
        }
    }
    
}
