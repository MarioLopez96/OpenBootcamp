package Tema_4;

public class EstructurasDeControl {

    public static void main(String[] args) {
        int numeroIf    = 0;
        int numeroWhile = 0;
        int numeroFor;
        String estacion = "otoño";

//condicion if
        if (numeroIf > 0) {
            System.out.println("El numero es mayor que cero");
        } else if (numeroIf < 0) {
            System.out.println("El numero es menor que cero");
        } else {
            System.out.println("El numero es cero");
        }
        System.out.println("");

//ciclo while
        while (numeroWhile < 3) {
            System.out.println("ciclo while: " + numeroWhile);
            numeroWhile++;
        }
        System.out.println("");

//ciclo do-while
        do {
            System.out.println("ciclo do-while: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        System.out.println("");

//ciclo for        
        for (numeroFor = 0; numeroFor < 3; numeroFor++) {
            System.out.println("ciclo for: " + numeroFor);
        }
        System.out.println("");

//Switch
        switch (estacion) {
            case ("primavera"):
                System.out.println("La estacion es: " + estacion);
                break;
                
            case ("verano"):
                System.out.println("La estacion es: " + estacion);
                break;
                
            case ("otoño"):
                System.out.println("La estacion es: " + estacion);
                break;
                
            case ("invierno"):
                System.out.println("La estacion es: " + estacion);
                break;
                
            default:
                System.out.println(estacion + " NO es una estacion");
        }
    }
}
