package maison;

import outil.Chaise;
import outil.Ordinateur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Salle {
    private int numeroDeLaSalle;
    private String nomDeLaSalle;

    public Set<Ordinateur> ordinateurList = new HashSet<>();
    private Set<Chaise> chaiseList = new HashSet<>();
    //   public Set <Salle> salleList =new HashSet<>();

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
    public Set<Ordinateur> ordinateurSet() {
        return ordinateurSet();
    }

    ;

    public void addOrdinateur(Ordinateur ordinateur) {

        this.ordinateurList.add(ordinateur);
    }
    //end of function to set and add chaise

    public Set<Chaise> chaiseSet() {
        return chaiseSet();
    }


    public void addChaise(Chaise chaise) {

        this.chaiseList.add(chaise);
    }
    //end of function to set and add chaise

    //Affichage showing all computers
    public void affichageDesOrdi() {

        if (ordinateurList.isEmpty()) {
            System.out.println("Pas d'ordinateur disponible dans la salle!");
        } else {
            for (Ordinateur e : ordinateurList) {
                int i = 0;
                System.out.println("Ordinateur: " + i + " , Couleur : " + e.getCouleur() + ", Marque : " + e.getMarque() + "  , Date de fabrication :  " + e.getDateDeFabrication());
                i++;
            }
        }

    }
    //end of showing all computers

    //returning liste of computers
    public Set<Ordinateur> getOrdinateurList() {
        return ordinateurList;
    }
    //end of returning liste of computers

    //returning liste of chairs
    public Set<Chaise> getChaiseList() {
        return chaiseList;
    }
    //end of returning liste of chairs

    //showing chairs in the salle
    public void affichageChaise() {
        if (chaiseList.isEmpty()) {
            System.out.println("Pas de chaise disponible dans la salle.");
        } else {

            for (Chaise c : chaiseList) {
                int i = 0;
                System.out.println("Chaise : " + i + " , Couleur : " + c.getCouleurDeLaChaise() + ", numéro de la chaise : " + c.getNumeroDeLaChaise() + ".");
                i++;
            }
        }
    }
    //end of showing chairs in the salle

    //showing ordinateur  in the salle
    public void affichageOrdinateur() {

        for (Ordinateur o : ordinateurList) {
            int l = 0;
            System.out.println("Ordinateur : " + l + " , Couleur de l'ordinateur : " + o.getCouleur() + ", date de fabrication de l'ordi  : " + o.getDateDeFabrication() + ".");
            l++;

        }
    }
    //end of showing ordinateur in the salle

}
