
package Tema_8;


public class Encapsulacion {

    public static void main(String[] args) {
        String nombre;
        int edad;
        int telefono;

        Persona persona1 = new Persona();

        persona1.setNombre("Mario");
        persona1.setEdad(26);
        persona1.setTelefono(818181);

        nombre = persona1.getNombre();
        edad = persona1.getEdad();
        telefono = persona1.getTelefono();

        System.out.println(
                "--Persona 1--" +
                "\nNombre:\t  "     + nombre + 
                "\nEdad:\t  "     + edad + 
                "\nTelefono: " + telefono);
    }
}

class Persona{
    private String nombre;
    private int    edad;
    private int    telefono;
    
//getter y setter
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setTelefono(int telefono){
       this.telefono = telefono;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public void setNombre(String nombre){
       this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}