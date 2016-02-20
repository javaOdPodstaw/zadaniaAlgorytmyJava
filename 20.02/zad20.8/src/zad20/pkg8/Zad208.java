package zad20.pkg8;

//8. Napisz program sumujący elementyparzyste w każdym wierszu tablicy dwuwymiarowe
import java.util.Random;

public class Zad208 {

    static int[][] tablica = new int[2][2];

    public static void main(String[] args) {
        wypelnij();
        oblicz();
    }

    static void wypelnij() {
        Random r = new Random();

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                tablica[i][j] = r.nextInt(20);
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    static void oblicz() {
        int parzysta = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                if(j % 2 ==0){
                    parzysta = parzysta + tablica[i][j];
                }
            }
          
        }
          System.out.println(parzysta);
    }
}
