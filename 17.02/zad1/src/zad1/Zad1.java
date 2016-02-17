//Napisz program, w którym zostanie utworzona 10
//-
//elementowa tablica liczb typu int. Za pomocą pętli 
//for zapisz w kolejnych komórkach liczby od 101 do 110. Zawartość tablicy wyświetl na ekranie

package zad1;

public class Zad1 {

    public static void main(String[] args) {
        int[] table = new int[10];
        int zmienna = 101;
        for (int i = 0; i<10; i++){
            table[i] = zmienna;
            zmienna+=1;
            System.out.println(table[i]);
        }
        
    }
    
}
