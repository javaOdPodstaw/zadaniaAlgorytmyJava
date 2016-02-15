package zad2;

public class Zad2 {

    public static void main(String[] args) {

        int a = 3;
        int b = 0;
        int c = a + b;
        int d = a - b;
        int f = a * b;
        int g;

        double e = 0;

        System.out.println("Wynik dodawania to " + c);
        System.out.println("Wynik odejmowania to " + d);

        try {
            g = a % b;
            e = 1.0 * a / b;
            System.out.println("Wynik dzielenia to " + e);
            System.out.println("Wynik modulo to " + g);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Wynik mnożenia to " + f);

    }

}
