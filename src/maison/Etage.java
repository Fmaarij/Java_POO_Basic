package maison;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Etage {
    private int numeroDeLeEtage;
    private String couleurDeLeEtage;
    //public List<Salle> salleList = new ArrayList<>();
    public Set<Salle> salleList = new HashSet<>();

    //constructor

    public Etage() {
    }
    //end of constructor

    //getter and setter

    public double getNumeroDeLeEtage() {
        return numeroDeLeEtage;
    }

    public void setNumeroDeLeEtage(int numeroDeLeEtage) {
        this.numeroDeLeEtage = numeroDeLeEtage;
    }

    public String getCouleurDeLeEtage() {
        return couleurDeLeEtage;
    }

    public void setCouleurDeLeEtage(String couleurDeLeEtage) {

        this.couleurDeLeEtage = couleurDeLeEtage;
    }

    //add Salle

    public boolean addSalle(Salle salle) {

        return salleList.add(salle);
    }

    //end of add salle
//returning list of salles
    public Set<Salle> getSalleList() {
        return salleList;
    }
    //returning list of salles

    //end of getter and setter

}
