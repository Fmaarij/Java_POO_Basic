public class Personne {
    private String nom, prenom, dateDeNaissance;
    private Compte compte;

    //Constructor
    public Personne() {
    }

    //Getter & Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    //affichage
    public String affichagePersonne(){
        return (this.nom +" " + this.prenom +" " + this.dateDeNaissance);
    }
}
