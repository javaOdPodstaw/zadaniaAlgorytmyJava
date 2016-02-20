/*
Napisz program działający zbieżnie do powyższego, lecz korzystający z klasy BigInteger do 
reprezentacji
liczb.
Napisz program, sprawdzający czy wczytana liczba z klawiatury jest liczbą pierwszą.
 */
package zad9a;

import java.math.BigInteger;
import java.util.Scanner;

public class Zad9a {

    
    public static void main(String[] args) {
        String pierwsza =pobor();
        sprawdzenie(pierwsza);
    }
    
    static String pobor(){
        Scanner sc = new Scanner(System.in);
        String liczbaPierwsza;
        System.out.println("Podaj liczbe");
        liczbaPierwsza = sc.nextLine();
        return liczbaPierwsza;
    }
    
    static boolean sprawdzenie(String arg){
        BigInteger lpierwsza = new BigInteger(arg);
        BigInteger zero = new BigInteger("0");
        int pomoc = 0;
        //System.out.println(Integer.9(arg));
        if(Integer.parseInt(arg)<2){
             System.out.println(lpierwsza + " nie jest pierwsza");
            return false;
        }
            
            for(BigInteger i=new BigInteger("2"); i.compareTo(lpierwsza)==-1; i=i.add(new BigInteger("1"))){

                if(lpierwsza.mod(i).compareTo(zero)==0){
                     System.out.println(lpierwsza + " nie jest pierwsza");
                    return false;

                }
            }

            System.out.println(lpierwsza + " jest pierwsza");
            return true;
    }
    
    
}
