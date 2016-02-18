/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortowanie;

import java.util.Arrays;

/**
 *
 * @author acer1
 */
public class Sortowanie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pred sortowaniem:");
        int[] tablica = {4,5,7,3,1};
        System.out.println(Arrays.toString(tablica));
        int[] tablica2 = Sorter.SorowaniePrzezWymiane(tablica);
        System.out.println("Po sortowaniu");
        System.out.println(Arrays.toString(tablica2));
    }
    
}
