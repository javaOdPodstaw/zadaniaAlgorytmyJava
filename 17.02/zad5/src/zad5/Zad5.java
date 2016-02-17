//Napisz program, w którym zost
//anie utworzona 10 elementowa tablica liczb typu int. Odwróć 
//elementy tablicy miejscami, a nastepnie wydrukuj tablicę
package zad5;

public class Zad5 {

  
    public static void main(String[] args) {
        int table[] = {1,2,3,4,5,6,7,8,9,10};
        int i;
        int temp = 0;
        for (i = 0; i < (table.length-1)/2; i++) {
            temp= table[i];
            table[i] = table[table.length-i-1];
            table[table.length-i-1] = temp;
            
        }
        for ( i = 0; i < 10; i++) {
            System.out.println(table[i]);
        }
        
    }
    
}
