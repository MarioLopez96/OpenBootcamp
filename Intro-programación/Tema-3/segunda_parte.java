
package Tema_3;

public class segunda_parte {
    
    public static void main(String[] args) {
       Coche miCoche = new Coche();
       miCoche.incPuertas();
       
        System.out.println("numero de  puertas: " + miCoche.numPuertas);
    }
    
    static class Coche{
        int numPuertas = 4;
        
        public void incPuertas(){
            numPuertas ++;
        }
    }   
}
