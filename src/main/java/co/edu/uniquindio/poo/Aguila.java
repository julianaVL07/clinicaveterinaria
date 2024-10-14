package co.edu.uniquindio.poo;

public class Aguila extends AnimalSalvaje {
    private String alas;
    private Habitat habitat;

    public Aguila(String nombre, int edad, double peso, String alimentacion, String alas, Habitat habitat) {
        super(nombre, edad, peso, alimentacion);
        this.alas = alas;
        this.habitat = habitat;
        assert edad>0;
    }

    public String getAlas() {
        return alas;
    }

    public void setAlas(String alas) {
        this.alas = alas;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "\nÁguila: nombre=" + nombre + ", alimentacion=" + alimentacion + ", alas=" + alas + ", edad=" + edad
                + ", peso=" + peso+", habitat=" + habitat.getTipoHabitat();
    }

    public static void distanciaRecorrida(String nombre, double distancia){
        System.out.println("\nEl águila "+nombre+ " recorrió una distancia de "+distancia+" km");
    }

    @Override
    public void comer(){
        Veterinaria.mostrarMensaje("El águila come a la 1PM");
    }

    @Override
    public void comportamientoInstintivo(){
        Veterinaria.mostrarMensaje("El águila recorre largas distancias y abre sus alas");
    }
}
