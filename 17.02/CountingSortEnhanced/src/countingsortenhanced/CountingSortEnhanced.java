
package countingsortenhanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;


public class CountingSortEnhanced {
    
    //Deklaracja tablicy ktora bedzie sortowana
    static int[] givenArray = {-2,45,3,41,-10,-2,45};

    public static void main(String[] args) {
//        //Tworzenie instacji hashMapy
//        HashMap<String, Integer> hashVar = new HashMap<>();
//        
//        //Wstawianie par klucz wartosc do hashMapy 
//        hashVar.put("pierwsza", 1);
//        hashVar.put("druga", 2);
//        
//        //Pobieranie wartosci z HashMapy za pomoca klucza
//        hashVar.get("pierwsza");
//        
//        //Tworzenie zestawu kluczy wykorzystywanych do iteracji
//        Set<String> keySet = hashVar.keySet();
//        
//        //Tworzenie iteratora z zestawu kluczy powyzej
//        Iterator<String> iter = keySet.iterator();
//        //Iterowanie przez hashmape za pomoca kontrukcji while
//        while(iter.hasNext()){//warunek do kiedy hashmapa ma kolejny element wchodz w petle
//             String iterVar = iter.next();//przesuwanie sie do nastepnego elementu. Zapobiega nieskonczonej petli 
//            System.out.println("Wartość to "  + hashVar.get(iterVar));
//            System.out.println("Klucz to "  + iterVar);
//        }
 
        int[] minMax = findMinimum(givenArray);
        List<Integer> sorted = countingSort(createHashMap(findMinimum(givenArray), givenArray));// Wywolanie w parametrze
        
        // Sprawdzenie poprawnosci sortowania
        for(int temp : sorted){
            System.out.print(temp+ " ");
        }
    }
    
    ///metoda pakietowa statyczna counting sort
    static List<Integer> countingSort(HashMap<Integer, Integer> tempHashMap){
        //stworzenie zestawu kluczy i iteratora
            Set keySet = tempHashMap.keySet();
            Iterator iter = keySet.iterator();
            
            List<Integer> resultSortedArr = new ArrayList<Integer>();
            // tymczasowe zmienne
            int tempHashKey;
            int tempCountOfKeys;
            //iteracja przez HashMape za pomoca petli while
            while(iter.hasNext()){
                tempHashKey = (int)iter.next();
                tempCountOfKeys = tempHashMap.get(tempHashKey);
                //wstawianie do nowej ArrayListy tyle elementow ile jest wartosci
                for (int i = 0; i < tempCountOfKeys; i++) {
                    resultSortedArr.add(tempHashKey);
                }
            }
            return resultSortedArr;
    }
    
    static int[] findMinimum(int[] arr1){
        //Przypisanie pierwszych
        int min = arr1[0];
        int max = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            max = max < arr1[i] ? arr1[i] : max;
            min = min > arr1[i] ? arr1[i] : min;
        }
        int[] result = {min, max};
        return result;
    }
    
    static HashMap<Integer, Integer> createHashMap(int[] minMax, int[] toSortArr){
        HashMap<Integer, Integer> hash = new LinkedHashMap<Integer, Integer>();
        //iterowanie od najmniejszej do najwiekszej wartosci z tablicy. Tworzenie kluczy o wartosciach 
        for (int i = minMax[0]; i <= minMax[1]; i++) {
            hash.put(i, 0);
        }
        int tempValue;
        // dodawanie ilosci wystepowania do wartosci 
        for (int i = 0; i < toSortArr.length; i++) {
            tempValue = hash.get(toSortArr[i]);
            hash.put(toSortArr[i], ++tempValue);
        }
        return hash;
    }
    
    
    
}
