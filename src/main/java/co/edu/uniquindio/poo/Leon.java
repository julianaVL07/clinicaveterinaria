package co.edu.uniquindio.poo;

public class Leon extends AnimalSalvaje {
    private String melena;
    private Habitat habitat;

    public Leon(String nombre, int edad, double peso, String alimentacion, String melena, Habitat habitat) {
        super(nombre, edad, peso, alimentacion);
        this.melena = melena;
        this.habitat = habitat;
        assert peso>=0.0;
    }

    public String getMelena() {
        return melena;
    }

    public void setMelena(String melena) {
        this.melena = melena;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "\nLeón: nombre=" + nombre + ", melena=" + melena + ", alimentacion=" + alimentacion + ", edad=" + edad
                +", peso=" + peso + ", habitat=" + habitat.getTipoHabitat();
    }

    public static void cazar(String nombre, String presa){
        System.out.println("\nEl león " + nombre+" está cazando "+presa);
    }

    @Override 
    public void comer(){
        Veterinaria.mostrarMensaje("El león come a las 11PM");
    }
    
    @Override
    public void comportamientoInstintivo(){
        Veterinaria.mostrarMensaje("El león caza y es agresivo");
    }
}
