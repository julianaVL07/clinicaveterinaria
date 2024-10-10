package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Habitat {
    private String clima;
    private TipoHabitat tipoHabitat;
    private LinkedList<Aguila> aguilas;
    private LinkedList<Leon> leones;

    public Habitat(String clima,TipoHabitat tipoHabitat) {
        this.clima = clima;
        this.tipoHabitat=tipoHabitat;
        aguilas=new LinkedList<>();
        leones=new LinkedList<>();
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public LinkedList<Aguila> getAguilas() {
        return aguilas;
    }

    public void setAguilas(LinkedList<Aguila> aguilas) {
        this.aguilas = aguilas;
    }

    public LinkedList<Leon> getLeones() {
        return leones;
    }

    public void setLeones(LinkedList<Leon> leones) {
        this.leones = leones;
    }
    
    public TipoHabitat getTipoHabitat() {
        return tipoHabitat;
    }

    public void setTipoHabitat(TipoHabitat tipoHabitat) {
        this.tipoHabitat = tipoHabitat;
    }

    @Override
    public String toString() {
        return "\nHábitat: clima=" + clima + ", TipoHabitat="+tipoHabitat+ "\náguilas=" + aguilas + "\nleones=" + leones;
    }

    public void agregarLeonHabitat(Leon leon){
        leones.add(leon);

    }

    public void agregarAguilaHabitat(Aguila aguila){
        aguilas.add(aguila);

    }

    
}
