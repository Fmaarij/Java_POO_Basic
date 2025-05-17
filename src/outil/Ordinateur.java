package outil;

import maison.Immeuble;

import java.util.ArrayList;
import java.util.List;

public class Ordinateur {
    private String marque, dateDeFabrication, capacitDisqueDur, capacitéDeLaRam, capacitéDuProcesseur, couleur;


    //constructor
    public Ordinateur() {

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

    public String getCapaciteDeLaRam() {
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


}
