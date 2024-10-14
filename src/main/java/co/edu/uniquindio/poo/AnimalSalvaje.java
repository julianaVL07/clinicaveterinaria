package co.edu.uniquindio.poo;

public abstract class AnimalSalvaje extends Animal {
    public String alimentacion;

    public AnimalSalvaje(String nombre, int edad, double peso, String alimentacion) {
        super(nombre, edad, peso);
        this.alimentacion = alimentacion;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    public abstract void comportamientoInstintivo();

}
