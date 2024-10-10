package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueno {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Perro> perros;
    private LinkedList<Gato> gatos;
    private LinkedList<Canario> canarios;

    public Dueno(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        perros=new LinkedList<>();
        gatos=new LinkedList<>();
        canarios=new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public LinkedList<Canario> getCanarios() {
        return canarios;
    }

    public void setCanarios(LinkedList<Canario> canarios) {
        this.canarios = canarios;
    }

    @Override
    public String toString() {
        return "\nDueño: nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "\nperros=" + perros
                + "\ngatos=" + gatos + "\ncanarios=" + canarios;
    }

    public void agregarCanarioDueno(Canario canario){
        canarios.add(canario);

    }

    public void agregarPerroDueno(Perro perro){
        perros.add(perro);

    }
    
    public void agregarGatoDueno(Gato gato){
        gatos.add(gato);

    }

    
}
