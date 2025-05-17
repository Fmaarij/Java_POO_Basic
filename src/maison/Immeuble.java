package maison;

import outil.Chaise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Immeuble {
    private String nomDeImmeuble, dateDeConstructionDeLeImmeuble;
    //Set<Adresse> adresseSet = new HashSet<>();
    private Adresse adresseUnique = new Adresse();
    private Set<Etage> etageList = new HashSet<>();
    public Set<Salle> salleList = new HashSet<>();

    //constructor
    public Immeuble() {
    }
    //end of constructor

    //getter and setter

    public String getNomDeImmeuble() {
        return nomDeImmeuble;
    }

    public void setNomDeImmeuble(String nomDeImmeuble) {
        this.nomDeImmeuble = nomDeImmeuble;
    }

    public String getDateDeConstructionDeLeImmeuble() {
        return dateDeConstructionDeLeImmeuble;
    }

    public void setDateDeConstructionDeLeImmeuble(String dateDeConstructionDeLeImmeuble) {
        this.dateDeConstructionDeLeImmeuble = dateDeConstructionDeLeImmeuble;
    }

//end of getter and setter

    //function to set and add floor
    public Set<Etage> etageSet() {
        return this.etageList;
    }

    ;

    public boolean addEtage(Etage etage) {

        return this.etageList.add(etage);
    }
    //end of function to set and add floor

    public boolean addSall(Etage etage, Salle salle) {
        for (Etage e : etageSet()) {
            if (e.equals(etage)) {
                return this.salleList.add(salle);
            }
        }
        return false;
    }


    //end of function to set and add floor


    //add Salle
    public boolean Salle(Salle salle) {
        return this.salleList.add(salle);
    }   //end of add salle

    //showing the floors
    public void affichageEtages() {
        int i = 0;
        for (Etage e : etageList) {
            System.out.println("Etage " + i + " , Couleur : " + e.getCouleurDeLeEtage() + ", Numéro de l'étage : " + e.getNumeroDeLeEtage());
            i++;
        }
        //end of showing floors
    }

    //returning list of etages
    public Set<Etage> getEtageList() {
        return etageList;
    }
    //end of returning list of etages

    //returning list of salles
    public Set<Salle> getSalleList() {
        return salleList;
    }
    //returning list of salles


}




