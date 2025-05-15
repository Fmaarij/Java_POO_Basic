package maison;

import outil.Chaise;
import outil.Ordinateur;

import java.util.HashSet;
import java.util.Set;

public class Salle {
    private int numeroDeLaSalle;
    private String nomDeLaSalle;

    private Set<Ordinateur> ordinateurSet = new HashSet<>();
    private Set<Chaise> chaiseSet = new HashSet<>();


    //constructor
    public Salle() {
    }
    //end of constructor

    //getter and setter

    public double getNumeroDeLaSalle() {
        return numeroDeLaSalle;
    }

    public void setNumeroDeLaSalle(int numeroDeLaSalle) {
        this.numeroDeLaSalle = numeroDeLaSalle;
    }

    public String getNomDeLaSalle() {
        return nomDeLaSalle;
    }

    public void setNomDeLaSalle(String nomDeLaSalle) {
        this.nomDeLaSalle = nomDeLaSalle;
    }

    //end of getter and setter

    //function to set and add ordinateur
    public Set<Ordinateur> ordinateurSet(){
        return ordinateurSet();
    };

    public void addOrdinateur(Ordinateur ordinateur) {
        this.ordinateurSet.add(ordinateur);
    }
    //end of function to set and add chaise

    //function to set and add ordinateur
    public Set<Chaise> chaiseSet(){
        return chaiseSet();
    };

    public void addChise(Chaise chaise) {
        this.chaiseSet.add(chaise);
    }
    //end of function to set and add chaise

}
