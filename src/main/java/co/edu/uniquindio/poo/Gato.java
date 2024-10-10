package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Gato extends AnimalDomestico {
    private String ColorPelaje;
    private Dueno dueno;

    public Gato(String nombre, int edad, double peso, LocalDate fechaNacimiento, String colorPelaje, Dueno dueno) {
        super(nombre, edad, peso, fechaNacimiento);
        ColorPelaje = colorPelaje;
        this.dueno = dueno;
    }

    public String getColorPelaje() {
        return ColorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        ColorPelaje = colorPelaje;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return "\nGato: nombre=" + nombre + ", edad=" + edad + ", peso en kg=" + peso + ", ColorPelaje=" + ColorPelaje
                + ", fechaNacimiento=" + fechaNacimiento + ", dueño=" + dueno.getNombre();
    }

    
    


    
}
