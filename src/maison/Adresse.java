package maison;

public class Adresse {

    private String nomDeLaRue,nomDeLaCommune,codePostal, ville, pays;
    private int  numeroRue;

    //constructor
    public Adresse(){

    }
    //End of constructor

    //getter and setter

    public String getNomDeLaRue() {
        return nomDeLaRue;
    }

    public void setNomDeLaRue(String nomDeLaRue) {
        this.nomDeLaRue = nomDeLaRue;
    }

    public int getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String  getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDeLaCommune() {
        return nomDeLaCommune;
    }

    public void setNomDeLaCommune(String nomDeLaCommune) {
        this.nomDeLaCommune = nomDeLaCommune;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    //end of getter and setter
}
