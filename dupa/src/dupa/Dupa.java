package dupa;


public class Dupa {

    public static void main(String[] args) {
        System.out.println(NowaKlasa.x);
        NowaKlasa nk1 = new NowaKlasa();
        NowaKlasa.x =5;
        System.out.println(nk1.getX());
        
    }
    
}

class NowaKlasa{
    static int x = 12;
     int getX(){
         return x;
     }
     void setX(int newX){
         x = newX;
     }
}
