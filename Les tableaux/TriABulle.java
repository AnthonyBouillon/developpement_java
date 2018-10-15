import java.util.*;
import javax.swing.*;

public class TriABulle {
    public static void main(String[] args) {
        System.out.println("Range par ordre croissant les index du tableau (boucle)");
        // On déclare nos variables
        int taille = 0;
        int compteur_index = 0;
        String saisie = "";
        String tableau[];
        int error = 0;
        // On récupère la taille du tableau
        System.out.print("Saisissez la taille du tableau : ");
        // La boucle continue jusqu'a ce que l'utilisateur est saisie une taille
        while (taille < 1) {
            error++;
            // Vérifie si la saisie est un int
            try {
                taille = Console.lireI();
            } catch (NumberFormatException e) {
                if (error > 3) {
                    System.out.println("M'en fou.. j'accepterais pas..");
                } else if (error > 2) {
                    System.out.println("Un nombre putain !!");
                } else if (error > 1) {
                    System.out.println("Un nombre je te dit !");
                } else {
                    System.out.println("Veuillez saisir un nombre");
                }
            }
        }
        // On assigne la taille au tableau
        tableau = new String[taille];
        // On récupère les valeurs du tableau
        // (nombre de valeur est égale à la taille du tableau)
        // Tant que chaque index du tableau n'a pas de valeur, l'utilisateur saisie
        while (compteur_index < taille) {
            System.out.print("Saisissez une valeur : ");
            saisie = Console.lireStr();
            tableau[compteur_index] = saisie;
            compteur_index++;
        }
        // Affichage du tableau
        System.out.println("Les valeurs du tableau que vous venez de saisir.");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        // Tant que tout les index du tableau n'ont pas était trié, on recommence
        while (compteur_index < (taille * 2)) {
            for (int i = 0; i < tableau.length - 1; i++) {
                // Compare si la valeur de l'index 1 est supérieur à l'index 2,
                // on échange les valeurs de place
                if (tableau[i].compareTo(tableau[i + 1]) > 0) {
                    // tableau[0] = tableau[1], tableau[1] = tableau[0]
                    String tableau_ancien = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = tableau_ancien;
                }
            }
            compteur_index++;
        }
        // Affichage du tableau après le tri effectué
        System.out.println("Tableau dans l'ordre");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(i + " " + tableau[i]);
        }
    }
}