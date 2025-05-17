import maison.Etage;
import maison.Immeuble;
import maison.Salle;
import outil.Chaise;
import outil.Ordinateur;

public class Main {
    public static void main(String[] args) {
        //creating The building
        Immeuble im = new Immeuble();
        im.setNomDeImmeuble("Paradise");
        im.setDateDeConstructionDeLeImmeuble("22/06/2000");
        //end of creating The building
        //creating etages(floors)
        Etage etage0 = new Etage();
        etage0.setNumeroDeLeEtage(0);
        etage0.setCouleurDeLeEtage("Red");
        Etage etage1 = new Etage();
        etage1.setNumeroDeLeEtage(1);
        etage1.setCouleurDeLeEtage("Blue");
        Etage etage2 = new Etage();
        etage2.setNumeroDeLeEtage(2);
        etage2.setCouleurDeLeEtage("Green");
        Etage etage3 = new Etage();
        etage3.setNumeroDeLeEtage(3);
        etage3.setCouleurDeLeEtage("Yellow");

        //end of creating etages(floors)
        //creating salles(rooms)
        Salle salle0 = new Salle();
        salle0.setNumeroDeLaSalle(0);
        salle0.setNomDeLaSalle("Cat");
        Salle salle1 = new Salle();
        salle1.setNumeroDeLaSalle(1);
        salle1.setNomDeLaSalle("Dog");
        Salle salle2 = new Salle();
        salle2.setNumeroDeLaSalle(2);
        salle2.setNomDeLaSalle("Pig");
        Salle salle3 = new Salle();
        salle3.setNumeroDeLaSalle(3);
        salle3.setNomDeLaSalle("Tiger");
        //end of creating salles(rooms)
        im.getEtageList();

        //creating oridnateur(computers)
        Ordinateur ordinateur0 = new Ordinateur();
        ordinateur0.setMarque("HP");
        ordinateur0.setCouleur("Blue");
        ordinateur0.setCapacitDisqueDur("2TB");
        ordinateur0.setCapacitéDeLaRam("16GB");
        ordinateur0.setCapacitéDuProcesseur("intel Cori9");
        ordinateur0.setDateDeFabrication("22/06/2000");
        Ordinateur ordinateur1 = new Ordinateur();
        ordinateur1.setMarque("Asus");
        ordinateur1.setCouleur("Red");
        ordinateur1.setCapacitDisqueDur("500GB");
        ordinateur1.setCapacitéDeLaRam("8GB");
        ordinateur1.setCapacitéDuProcesseur("intel Cori5");
        ordinateur1.setDateDeFabrication("01/10/2015");
        Ordinateur ordinateur2 = new Ordinateur();
        ordinateur2.setMarque("Dell");
        ordinateur2.setCouleur("Green");
        ordinateur2.setCapacitDisqueDur("5TB");
        ordinateur2.setCapacitéDeLaRam("32GB");
        ordinateur2.setCapacitéDuProcesseur("intel Cori9");
        ordinateur2.setDateDeFabrication("22/06/2000");

        //end of creating oridnateur(computers)

        //creating chaise(chair)
        Chaise chaise1 = new Chaise();
        chaise1.setNumeroDeLaChaise(0);
        chaise1.setCouleurDeLaChaise("White");
        Chaise chaise2 = new Chaise();
        chaise2.setNumeroDeLaChaise(1);
        chaise2.setCouleurDeLaChaise("Green");
        Chaise chaise3 = new Chaise();
        chaise3.setNumeroDeLaChaise(2);
        chaise3.setCouleurDeLaChaise("Purple");
        Chaise chaise4 = new Chaise();
        chaise4.setNumeroDeLaChaise(3);
        chaise4.setCouleurDeLaChaise("Red");
        //end of creating chaise(chair)
        //adding in a room in a floor
        im.addEtage(etage0);
        im.addEtage(etage1);
        im.addEtage(etage2);
        im.addEtage(etage3);
        im.addSall(etage0, salle0);
        im.addSall(etage0, salle1);
        im.addSall(etage1, salle2);
        im.addSall(etage2, salle3);
        //end of adding a room in a floor


        //adding computers into the salle
        salle1.addOrdinateur(ordinateur0);
        salle1.addOrdinateur(ordinateur1);
        salle3.addOrdinateur(ordinateur2);
        //end of adding computers into the salle

        //adding chaise(chairs) and showing them
        salle0.addChaise(chaise1);
        salle1.addChaise(chaise2);
        salle2.addChaise(chaise3);
        salle2.addChaise(chaise4);
        // salle2.affichageChaise();
        //end od adding chaise(chairs) and showing them

        //1.showing those computers which has same date of creation(fabrication)
        System.out.println("******Liste des ordinateur dont la date de construction de immeube et ordinateur est la meme.******");
        String dateConstructionImmeuble = im.getDateDeConstructionDeLeImmeuble();
        int k = 0;
        for (Salle salle : im.getSalleList()) {
            for (Ordinateur ordinateur : salle.getOrdinateurList()) {
                if (ordinateur.getDateDeFabrication().equals(dateConstructionImmeuble)) {
                    System.out.println("Ordinateur " + k + " : Marque = " + ordinateur.getMarque()
                            + ", Couleur = " + ordinateur.getCouleur()
                            + ", Date fabrication = " + ordinateur.getDateDeFabrication());
                    k++;
                }
            }
        }
        if (k == 0) {
            System.out.println("Aucun ordinateur avec la même date de construction que l'immeuble.");
        }
        //1. end of showing those computers which has same date of creation(fabrication)

        //2.Showing the chair which is equal in color with floor(etage)
        System.out.println("******les chaises dont la couleur est la même que la couleur de l’étage******");
        int l = 0;
        for (Etage etage : im.getEtageList()) {
            for (Salle salle : im.getSalleList()) {
                for (Chaise chaise : salle.getChaiseList()) {
                    if (chaise.getCouleurDeLaChaise().equals(etage.getCouleurDeLeEtage())) {
                        System.out.println("Chaise " + l + ", Couleur = " + chaise.getCouleurDeLaChaise() + ", numéro de la chaise " + chaise.getNumeroDeLaChaise() + ", correspond à l'étage : " + etage.getCouleurDeLeEtage());
                        l++;
                    }
                }
            }
        }

        if (l == 0) {
            System.out.println("Aucun chaise avec la même couleur que l'étage.");
        }

        //2.end of Showing the chair which are equal in color with floor(etage)

        //3.showing the floor which has the maximum rooms(salle)
        etage0.addSalle(salle0);
        etage0.addSalle(salle1);
        etage1.addSalle(salle2);
        etage2.addSalle(salle3);


        Etage nombreDeMaxDeEtage = null;
        int maxFloor = 0;
        for (Etage etage : im.getEtageList()) {
            int nombreDesalle = etage.getSalleList().size();
            if (nombreDesalle > maxFloor) {
                maxFloor = nombreDesalle;
                nombreDeMaxDeEtage = etage;
            }
        }

        if (nombreDeMaxDeEtage != null) {
            System.out.println("******L'étage avec le plus de salles est :*******");
            System.out.println("Numéro de l'étage : " + nombreDeMaxDeEtage.getNumeroDeLeEtage());
            System.out.println("Couleur de l'étage : " + nombreDeMaxDeEtage.getCouleurDeLeEtage());
            System.out.println("Nombre de salles : " + maxFloor);
        } else {
            System.out.println("Aucun étage n'a de salle.");
        }
    }

    //3.end of showing the floor which has the maximum rooms(salle)

}