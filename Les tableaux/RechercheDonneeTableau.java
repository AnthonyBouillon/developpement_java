import java.util.*;

public class RechercheDonneeTableau {
    public static void main(String[] args) {

        String tableau[] = { "Marie", "Jean", "André", "Jeanne", "Pierre", "René", "Marcel", "Roger", "Louis" };
        boolean word = false;
        // Affichage de la liste des prénoms du tableau
        System.out.println("La liste des prénoms");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        // Récupération du prénom à rechercher
        System.out.println("Ecriver le prénom recherché");
        String prenom = Console.lireStr();

        // Compare si deux valeurs sont similaires
        for (int i = 0; i < tableau.length; i++) {
            if (prenom.equals(tableau[i])) {
                word = true;
                tableau[i] = "";

            }
        }
        // Affichage de la liste des prénoms du tableau
        System.out.println("La liste des prénoms après la sélection");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        // Affiche si le prénom existe ou non
        if (word == true) {
            System.out.println("Le prénom à était trouvé !");
        } else {
            System.out.println("Le prénom n'a pas était trouvé..");
        }

    }
}