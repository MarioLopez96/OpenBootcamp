
package Tema_9;


public class herencia {

    public static void main(String[] args) {
        Cliente    cliente    = new Cliente(250000,28,818181,"Juan");
        Trabajador trabajador = new Trabajador(15000,22,828282,"Carlos");

        System.out.println(cliente.toString()+ "\n");
        System.out.println(trabajador.toString());
    }
}

class Persona {

    int edad;
    int telefono;
    String nombre;

    public Persona(int edad, int telefono, String nombre) {
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }
}

class Cliente extends Persona {

    int credito;

    public Cliente(int credito, int edad, int Telefono, String nombre) {
        super(edad, Telefono, nombre);
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "--Cliente--\n"    + 
                "Nombre: "    + nombre   + "\n"+
                "Edad: "      + edad     + "\n"+
                "Telefono: "  + telefono + "\n"+
                "credito: "   + credito;
    }
}

class Trabajador extends Persona {

    int salario;

    public Trabajador(int salario, int edad, int telefono, String nombre) {
        super(edad, telefono, nombre);
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "--Trabajador--\n" +
                "Nombre: "   + nombre   + "\n"+
                "Edad: "     + edad     + "\n"+
                "Telefono: " + telefono + "\n"+
                "salario: "  + salario;
    }
}
