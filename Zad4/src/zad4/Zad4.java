/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad4;



/**
 *
 * @author acer1
 */
public class Zad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Oblicz obj = new Oblicz();
      try{
        obj.obiczMiejscaZerowe(10, 3, 10);
        System.out.println("Wynik: " + obj.x1 + ", " + obj.x2);
      }catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
    
}

class Oblicz{
    double delta = 0;
    double x1 = 0, x2 =0;
    void obiczMiejscaZerowe(double a, double b,double c) throws Exception{
        this.delta = b*b - 4 * a * c;
        if(this.delta == 0){
            this.x1 = this.x2 = -b / 2*a;
        }else if(this.delta > 0){
           this.x1 = (-b -Math.sqrt(a))/ 2*a;
           this.x2 = (-b +Math.sqrt(a))/ 2*a;
        }else{
            throw new Exception("Delta mniejsza od zera");
        }
    }
}
