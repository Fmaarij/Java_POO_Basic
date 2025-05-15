package outil;

import maison.Immeuble;

public class Ordinateur {
    private String marque, dateDeFabrication, capacitDisqueDur,capacitéDeLaRam,capacitéDuProcesseur,couleur;

    //constructor
    public Ordinateur(){

    }
    //end of constructor

    //getter and setter

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getDateDeFabrication() {
        return dateDeFabrication;
    }

    public void setDateDeFabrication(String dateDeFabrication) {
        this.dateDeFabrication = dateDeFabrication;
    }

    public String getCapacitDisqueDur() {
        return capacitDisqueDur;
    }

    public void setCapacitDisqueDur(String capacitDisqueDur) {
        this.capacitDisqueDur = capacitDisqueDur;
    }

    public String getCapacitéDeLaRam() {
        return capacitéDeLaRam;
    }

    public void setCapacitéDeLaRam(String capacitéDeLaRam) {
        this.capacitéDeLaRam = capacitéDeLaRam;
    }

    public String getCapacitéDuProcesseur() {
        return capacitéDuProcesseur;
    }

    public void setCapacitéDuProcesseur(String capacitéDuProcesseur) {
        this.capacitéDuProcesseur = capacitéDuProcesseur;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    //end of getter and setter

    //methode pour avoir la meme date de la fabriction et la date de construction l'ordi
    public void affichageDateDeFabricatioOrdiEtMeuble(Immeuble dateFabricationImmeuble){
        if(dateFabricationImmeuble.getDateDeConstructionDeLeImmeuble()==dateDeFabrication){
            System.out.println(getMarque() + getCouleur() + getCapacitDisqueDur() + getCapacitéDeLaRam() + getDateDeFabrication() + " et voila date de la construction de l'immeuble: "+ dateFabricationImmeuble.getDateDeConstructionDeLeImmeuble());
        }
    }
    //end methode pour avoir la meme date de la fabriction et la date de construction l'ordi
}
