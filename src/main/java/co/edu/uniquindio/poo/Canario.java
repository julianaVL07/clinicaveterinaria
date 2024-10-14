package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Canario extends AnimalDomestico {
    private int tamano;
    private Dueno dueno;
    
    public Canario(String nombre, int edad, double peso, LocalDate fechaNacimiento, int tamano, Dueno dueno) {
        super(nombre, edad, peso, fechaNacimiento);
        this.tamano = tamano;
        this.dueno = dueno;
        assert !nombre.isBlank();
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "\nCanario: nombre=" + nombre + ", edad=" + edad + ", peso en kg=" + peso + ", tamano en cm=" + tamano
                + ", fechaNacimiento=" + fechaNacimiento + ", dueño=" + dueno.getNombre();
    }

    @Override
    public void comer(){
        Veterinaria.mostrarMensaje("El canario come a las 2PM");
    }

    @Override
    public void cuidadosFrecuentes(){
        Veterinaria.mostrarMensaje("El canario necesita que le den gusanos y lo besen");
    }
    
}
