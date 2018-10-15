import java.util.*;
import javax.swing.*;

public class RechercheDonneeTableau {
    public static void main(String[] args) {

        String tableau[] = { "Marie", "Jean", "André", "Jeanne", "Pierre", "René", "Marcel", "Roger", "Louis" };
        boolean word = false;
        int test = 0;
        // Affichage de la liste des prénoms du tableau
        System.out.println("La liste des prénoms");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        // Récupération du prénom à rechercher
        System.out.println("Ecriver le prénom recherché");
        String prenom = Console.lireStr();
        for (int i = 0; i < tableau.length - 1; i++) {
            if (prenom.equals(tableau[i])) {
                word = true;
                tableau[i] = ".";
                String tableau_ancien = tableau[i];
                tableau[i] = tableau[i + 1];
                tableau[i + 1] = tableau_ancien;
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