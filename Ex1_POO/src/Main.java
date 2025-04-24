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
        samir.setPrenom("Samir");
        samir.setNom("Claudy");
        samir.setDateDeNaissance( "24/04/1999");
        //Fin de la création de la personne Samir
        //Création de la personne Jean
        Personne jean = new Personne();
        jean.setPrenom("Jean");
        jean.setNom("Broustin");
        jean.setDateDeNaissance( "10/09/2001");
        //Fin de la création de la personne Jean

        //Création de compte numéro 1
        Random random = new Random();
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String passWord = "";

        Compte compteSamir = new Compte();
        compteSamir.setLogin(samir.getNom() + "_" + samir.getPrenom());
        compteSamir.setMotDePasse(samir.getPrenom() + "." + random.nextInt(1000));

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
        compteJean.setLogin(jean.getNom() + "_" + jean.getPrenom());
        compteJean.setMotDePasse(jean.getPrenom() + "." + random.nextInt(1000));
        //Fin de la création de compte numéro 2

        //Création de l'adresse numéro 1
        Adresse adresse1 = new Adresse();
        adresse1.setNomDeLaRue("Rue berger");
        adresse1.setNumeroRue("24");
        adresse1.setCodePostal("1070");
        adresse1.setNomDeLaCommune("Anderlecht");
        adresse1.setNomDeLaCommune( "Bruxelles");
        adresse1.setPays("Belgique");
        //End of création de l'adresse numéro 1
        //Création de l'adresse numéro 2
        Adresse adresse2 = new Adresse();
        adresse2.setNomDeLaRue("Avenue de bouchon");
        adresse2.setNumeroRue("137");
        adresse2.setCodePostal("1050");
        adresse2.setNomDeLaCommune("Ixelles");
        adresse2.setVille("Bruxelles");
        adresse2.setPays("Belgique");
        //End of création de l'adresse numéro 2

        //Attribuer une adresse à une personne
        //End of attribuer une adresse à une personne



        //Affichage
        System.out.println("***** " + samir.getNom() + " voil votre login et mot de passe ***** ");
        System.out.println("Login : " + compteSamir.getLogin());
        System.out.println("Mot de passe : " + compteSamir.getMotDePasse());
        System.out.println("***** " + jean.getNom() + " voil votre login et mot de passe ***** ");
        System.out.println("Login : " + compteJean.getLogin());
        System.out.println("Mot de passe : " + compteJean.getMotDePasse());


        System.out.println(samir.affichagePersonne());
        //Fin de l'affichage


    }
}