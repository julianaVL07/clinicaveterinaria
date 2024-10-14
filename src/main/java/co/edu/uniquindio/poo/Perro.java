package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Perro extends AnimalDomestico {
    private String raza;
    private Dueno dueno;

    public Perro(String nombre, int edad, double peso, LocalDate fechaNacimiento, String raza, Dueno dueno) {
        super(nombre, edad, peso, fechaNacimiento);
        this.raza = raza;
        this.dueno = dueno;
        assert !nombre.isBlank();
        assert !raza.isBlank();
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "\nPerro: nombre=" + nombre + ", edad=" + edad + ", peso en kg=" + peso + ", raza=" + raza + ", fechaNacimiento="
                + fechaNacimiento + ", dueño=" + dueno.getNombre();
    } 
    
    @Override
    public void comer(){
        Veterinaria.mostrarMensaje("El perro come a las 12Pm");
    }

    @Override
    public void cuidadosFrecuentes(){
        Veterinaria.mostrarMensaje("El perro necesita que le den paseos y lo bañen");
    }
}
