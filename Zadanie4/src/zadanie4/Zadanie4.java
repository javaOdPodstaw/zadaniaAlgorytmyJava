/*
4. Napisz klasę Pracownik, która będzie zawierała 3 pola: imie, nazwisko oraz wiek. Następnie 
zainicjalizuj dwie instancje klasy Pracownik oraz wyświetl tych pracowników 
(wydrukuj pola instancji 
obiektu).
 */
package zadanie4;
//W każdym pliku .java może być wyłącznie jedna klasa publiczna. Przez te klasy publiczne udostępniamy metody i pola projektu
public class Zadanie4 {
    
    // W całym projekcie może być wyłącznie jedna metoda 
    public static void main(String[] args) {
        Pracownik p1 = new Pracownik("Bartosz", "Gawron", 29);
        System.out.println("Imie to: " + p1.imie);
        System.out.println("Nazwisko to: " + p1.nazwisko);
        System.out.println("Wiek to: " + p1.wiek);
        
        // tworzenie drugiej instancji
        System.out.println("Druga osoba");
        Pracownik p2 = new Pracownik("Matuesz", "Noga", 29);
        System.out.println("Imie to: " + p2.imie);
        System.out.println("Nazwisko to: " + p2.nazwisko);
        System.out.println("Wiek to: " + p2.wiek);
    }
    
}


//Nowa klasa lokalna/pakietowa tzn. bez specyfikatora dostępu o nazwie pracownik 
class Pracownik{
    
    //Deklaracja zmiennych niestatycznych bez inicjalizacji
    String imie;
    String nazwisko;
    int wiek;
    
    //deklaracja konstruktora klasy pracownik. Musi miec tryb dostępu publiczny i nazwę identyczną ja nazwa klasy w ktorej sie znajduje
    // kontruktor jest metodą ktora przy tworzeniu instacji inicjalizuje zmienne imie, nazwisko, wiek
    // jezeli sami nie zadeklarujemy konstruktora, kompilator użyje konstruktora domyslnego bez żadnych argumentów tj.     
        public Pracownik(String im, String nazw, int wiek){
            this.imie = im;
            this.nazwisko = nazw;
            this.wiek = wiek;
        }    
        
        //Przeciazanie z niebezpieczne z  ... niewiadomo jaka iloscia argumentow bo mozna nie podac zadnego czyli bez typu i kompilator sie gubi
//        void metoda1(String[] ... arg){
//            System.out.println("Nie podałeś tekstu");
//        }
//        void metoda1(int ... arg){
//            System.out.println("Nie wiem");
//        }
        
    
    
    
    
}