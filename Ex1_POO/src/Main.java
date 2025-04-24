import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
     /*
    créer la classe Personne (non, prénom, date de naissance) et la classe
    Compte (login, mot de passe). Puis Associer une personne et son compte.
    - Homework : continue l’exercice de POO ci-dessus en créant la classe Adresse (nom de la rue,
    numéro rue, code postal, nom de la commune, ville, pays). Puis Associe une personne et son
    adresse
      */
        System.out.println("***** Classe personne, Compte Et Adresse *****");
        //Création de la personne Samir
        Personne samir = new Personne();
        samir.prenom = "Samir";
        samir.nom = "Claudy";
        samir.dateDeNaissance = "24/04/1999";
        //Fin de la création de la personne Samir
        //Création de la personne Jean
        Personne jean = new Personne();
        jean.prenom = "Jean";
        jean.nom = "Broustin";
        jean.dateDeNaissance = "10/09/2001";
        //Fin de la création de la personne Jean

        //Création de compte numéro 1
        Random random = new Random();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String passWord = "";

        Compte compteSamir = new Compte();
        compteSamir.login = samir.getNom() + "_" + samir.getPrenom();
        compteSamir.motDePasse = samir.getPrenom() + "." + random.nextInt(1000);

        /* selectioner un passsword depuis des lettre d'une tableau
        for(int i =0; i<alphabet.length; i++ ){
            int indexTableau= (int) (Math.random()*(alphabet.length-1));
            passWord+= alphabet[indexTableau];
        }
        compteSamir.motDePasse =passWord ;
        System.out.println(compteSamir.motDePasse);
*/
        //Fin de la création de compte numéro 1

        //Création de compte numéro 2
        Compte compteJean = new Compte();
        compteJean.login = jean.getNom() + "_" + jean.getPrenom();
        compteJean.motDePasse = jean.getPrenom() + "." + random.nextInt(1000);
        //Fin de la création de compte numéro 2

        //Création de l'adresse numéro 1
        Adresse adresse1 = new Adresse();
        adresse1.nomDeLaRue = "Rue berger";
        adresse1.numeroRue = "24";
        adresse1.codePostal = "1070";
        adresse1.nomDeLaCommune = "Anderlecht";
        adresse1.ville = "Bruxelles";
        adresse1.pays = "Belgique";
        //End of création de l'adresse numéro 1
        //Création de l'adresse numéro 2
        Adresse adresse2 = new Adresse();
        adresse2.nomDeLaRue = "Avenue de bouchon";
        adresse2.numeroRue = "137";
        adresse2.codePostal = "1050";
        adresse2.nomDeLaCommune = "Ixelles";
        adresse2.ville = "Bruxelles";
        adresse2.pays = "Belgique";
        //End of création de l'adresse numéro 2


        //Affichage
        System.out.println("***** " + samir.nom + " voil votre login et mot de passe ***** ");
        System.out.println("Login : " + compteSamir.login);
        System.out.println("Mot de passe : " + compteSamir.motDePasse);
        System.out.println("***** " + jean.nom + " voil votre login et mot de passe ***** ");
        System.out.println("Login : " + compteJean.login);
        System.out.println("Mot de passe : " + compteJean.motDePasse);


        System.out.println(samir.affichagePersonne());
        //Fin de l'affichage


    }
}