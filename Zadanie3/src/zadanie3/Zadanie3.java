package zadanie3;
import java.util.*;

public class Zadanie3 {

    public static void main(String[] args) {
        //Stworzenie instancji klasy Scanner ktora wczytuje input od usera przez konsole
        Scanner sc = new Scanner(System.in);
        //Ustawianie formatu wprowadzania zmiennej typu double w Polsce jest przecinek a w US jest kropka
        sc.useLocale(Locale.US);
        // Zapytanie w konsoli do usera
        System.out.println("Wpisz argumenty funkcji dla a1");
        double a1 = 0;
        
        //Dopoki nie poda poprawnej wartosci
        while(!sc.hasNextDouble()){
            System.out.println("Podaj poprawna dla pierwszej zmiennej");
            //Przyjmij nastepna wartosc podana przez uzytkownika i sprobuj kolejny raz warunek while
            sc.next();
        }
        //Po wyjsciu z petli while przypisz wartosc do zmiennej wiek
        a1 = sc.nextDouble();
        System.out.println("Wpisz argumenty funkcji dla a2");
        double a2 = 0;
        //Konstrukcja analogiczna do powyzszej
        while(!sc.hasNextDouble()){
            System.out.println("Podaje poprawność dla drugiej zmiennej typu double");
            sc.next();
        }
        a2 = sc.nextDouble();
        
        //Wywolanie metody statycznej
//        Input.pokazSieStatycznie();
        
        //Wywowlanie metody niestatycznej
//        Input input1 = new Input();// Stworzenie najpierw instancji klasy
//        input1.pokazSieInstacjo(); // Wywowlanie metody niestatycznej z instancji klasy

        // wywowłanie metody ktora "throws" Exception w bloku try -> catch 
        try{
            System.out.print("Wynki to: ");
            System.out.println(Input.getResult(a1, a2, "-"));
        }catch(Exception e){
            //Wydrukuj tresc bledy ktory jest zwracany jako wyjatek            
            System.out.println(e.getMessage());
        }
    

        
    }
    
}



class Input{
//        void pokazSieInstacjo(){
//            System.out.println("Jestem klasa Instancja");
//        }
//    
//     static void pokazSieStatycznie(){
//         System.out.println("Jestem klasa Statyczna");
//     }
    static double getResult(double a, double b, String sign) throws Exception{
        double result =0;
        switch(sign){
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                if(b==0){
                    System.out.println("Podana wartosc jest nieprawidlowa, dzielimy przez zero");
                    break;
                }
                result = a /b;
                break;
            case "*":
                result = a * b;
                break;
            case "%":
                if(b==0){
                    System.out.println("Podana wartosc jest nieprawidlowa, dzielimy przez zero");
                    break;
                }
                result = a % b;
                break;
        }
         return result;  
   

    }
}
