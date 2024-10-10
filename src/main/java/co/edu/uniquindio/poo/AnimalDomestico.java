package co.edu.uniquindio.poo;
import java.time.LocalDate;

public class AnimalDomestico extends Animal {
    public LocalDate fechaNacimiento;

    public AnimalDomestico(String nombre, int edad, double peso, LocalDate fechaNacimiento) {
        super(nombre, edad, peso);
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public static void cuidadosFrecuentes(String animal,String nombre, String cuidados ){
        System.out.println("\nEl animal doméstico: "+animal+ " con nombre " +nombre +" necesita "+cuidados);
    }
}
