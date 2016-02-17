
package zad2;

//Napisz program, w którym zostanie utworzona 10
//-
//elementowa tablica liczb typu int. Użyj pętli for do 
//wypełnienia jej danymi w taki sposób, aby w kolejnych komórkach znalazły się liczby od 10 do 100 
//(czyli 10, 20, 30 itd.). Zawartość tablicy wyświetl na ekra
//nie
public class Zad2 {

    
    public static void main(String[] args) {
        
        int [] table = new int[10];
        int zmienna = 10;
        for (int i=0; i<10; i++)
        {
            table[i]=zmienna*(i+1);
            System.out.println(table[i]);
        }
       
    }
    
}
