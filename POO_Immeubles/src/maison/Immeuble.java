package maison;

import java.util.HashSet;
import java.util.Set;

public class Immeuble {
    private String nomDeImmeuble, dateDeConstructionDeLeImmeuble;
    //Set<Adresse> adresseSet = new HashSet<>();
    private Adresse adresseUnique = new Adresse();
    private Set<Etage> etageSet = new HashSet<>();

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
    public Set<Etage> getEtageSet(){
        return getEtageSet();
    };

    public void addEtage(Etage etage) {
        this.etageSet.add(etage);
    }
    //end of function to set and add floor


}
