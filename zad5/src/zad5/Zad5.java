/*
 * Utwórz klasę Auto, ktora bedzie przechowywała informacje: marke, rok_produkcji. Następnie 
utwórz klasę Czesc, która będzie rozszerzeniem klasy Auto i zawierała pola nazwa oraz cena. Stwórz 
dwie instancje obiektu Czesc
, uzupełnij dane i wyświetl ich Markę oraz nazwę i cenę częścipen the template in the editor.
 */
package zad5;

/**
 *
 * @author acer1
 */
public class Zad5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Czesc cze = new Czesc();
        cze.nazwa = "Drzwi";
        cze.marka = "Fiat";
        System.out.println(cze.nazwa + " " + cze.marka);
        Auto pojazd = new Auto();
        
    }
 
}

class Auto {
    String marka;
    int rok_produkcji;
}

class Czesc extends Auto {
    String nazwa;
    double cena;
}
