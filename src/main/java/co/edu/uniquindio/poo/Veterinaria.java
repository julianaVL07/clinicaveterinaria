package co.edu.uniquindio.poo;
import java.util.LinkedList;
import java.util.Scanner;

public class Veterinaria {
    private String nombre;
    private LinkedList<Dueno> duenos;
    private LinkedList<Habitat> habitats;
    private LinkedList<Canario> canarios;
    private LinkedList<Perro> perros;
    private LinkedList<Gato> gatos;
    private LinkedList<Leon> leones;
    private LinkedList<Aguila> aguilas;
    
        public Veterinaria(String nombre) {
        this.nombre = nombre;
        duenos=new LinkedList<>();
        habitats=new LinkedList<>();
        canarios=new LinkedList<>();
        perros=new LinkedList<>();
        gatos=new LinkedList<>();
        leones=new LinkedList<>();
        aguilas=new LinkedList<>();
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public LinkedList<Dueno> getDuenos() {
            return duenos;
        }

        public void setDuenos(LinkedList<Dueno> duenos) {
            this.duenos = duenos;
        }

        public LinkedList<Habitat> getHabitats() {
            return habitats;
        }

        public void setHabitats(LinkedList<Habitat> habitats) {
            this.habitats = habitats;
        }

        public LinkedList<Canario> getCanarios() {
            return canarios;
        }

        public void setCanarios(LinkedList<Canario> canarios) {
            this.canarios = canarios;
        }

        public LinkedList<Perro> getPerros() {
            return perros;
        }

        public void setPerros(LinkedList<Perro> perros) {
            this.perros = perros;
        }

        public LinkedList<Gato> getGatos() {
            return gatos;
        }

        public void setGatos(LinkedList<Gato> gatos) {
            this.gatos = gatos;
        }

        public LinkedList<Leon> getLeones() {
            return leones;
        }

        public void setLeones(LinkedList<Leon> leones) {
            this.leones = leones;
        }

        public LinkedList<Aguila> getAguilas() {
            return aguilas;
        }

        public void setAguilas(LinkedList<Aguila> aguilas) {
            this.aguilas = aguilas;
        }

        @Override
        public String toString() {
            return "\nVeterinaria: nombre=" + nombre + "\n\nDueños=" + duenos + "\n\nHábitats=" + habitats + "\n\nCanarios="
                    + canarios + "\n\nPerros=" + perros + "\n\nGatos=" + gatos + "\n\nLeones=" + leones + "\n\nÁguilas="
                    + aguilas;
        }

        public static void mostrarMensaje( String mensaje){
            System.out.println(mensaje);
        }

        public void agregarDueno(Dueno dueno){
            duenos.add(dueno);
    
        }

        public void agregarHabitat(Habitat habitat){
            habitats.add(habitat);
    
        }

        public void agregarCanario(Canario canario){
            canarios.add(canario);
    
        }

        public void agregarPerro(Perro perro){
            perros.add(perro);
    
        }
        
        public void agregarGato(Gato gato){
            gatos.add(gato);
    
        }

        public void agregarLeon(Leon leon){
            leones.add(leon);
    
        }

        public void agregarAguila(Aguila aguila){
            aguilas.add(aguila);
    
        }

        public LinkedList<Leon> leonPesoMenor(){
            LinkedList<Leon>leonPesoRequisito=new LinkedList<>();
            for (Leon leon:leones){
                if(leon.getPeso()<300.00){
                    leonPesoRequisito.add(leon);
                }
            }
            return leonPesoRequisito;
        } 
        
        public static int ingresarEntero(String mensaje){
            Scanner scanner=new Scanner(System.in);
            System.out.println(mensaje);
            return scanner.nextInt();
        }
}
