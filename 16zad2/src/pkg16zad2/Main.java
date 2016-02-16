/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16zad2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dystans = 132;//w kilometrach
        double predkosc = 0;//predkosc w km/h
        double czas = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj predkosc w km/h: ");
        while(!sc.hasNextDouble()){
            System.out.println("Podaj prawidlowa wartosc-km/h");
            sc.next();    
        }
        predkosc = sc.nextDouble();
        
        czas = dystans/predkosc;
       
        System.out.println("Czas w minutach =" + (czas*60));
        
    }
    
}
