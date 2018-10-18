import java.util.*;
import javax.swing.*;

public class TriABulle {
    public static void main(String[] args) {
        System.out.println("Range par ordre croissant les index du tableau (boucle)");
        // ----------------------------------------------------------------------------
        // CREATION DES VARIABLES
        int taille = 0;
        int compteur_index = 0;
        String saisie = "";
        String tableau[];
        int error = 0;
        // ----------------------------------------------------------------------------
        // RECUPERATION DE LA TAILLE DU TABLEAU
        System.out.print("Saisissez la taille du tableau : ");
        while (taille < 1) {
            error++;
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
        tableau = new String[taille];
        // ----------------------------------------------------------------------------
        // REMPLISSAGE DU TABLEAU
        while (compteur_index < taille) {
            System.out.print("Saisissez une valeur : ");
            saisie = Console.lireStr();
            tableau[compteur_index] = saisie;
            compteur_index++;
        }
        // ----------------------------------------------------------------------------
        // AFFICHAGE DU TABLEAU
        System.out.println("Les valeurs du tableau que vous venez de saisir.");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
        // ----------------------------------------------------------------------------
        // TRI DU TABLEAU
        compteur_index = 0;
        while (compteur_index < (taille)) {
            for (int i = 0; i < tableau.length - 1; i++) {
                if (tableau[i].compareTo(tableau[i + 1]) > 0) {
                    String tableau_ancien = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = tableau_ancien;
                }
            }
            compteur_index++;
        }
        // ----------------------------------------------------------------------------
        // AFFICHAGE DU TABLEAU
        System.out.println("Tableau dans l'ordre");
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(i + " " + tableau[i]);
        }
    }
}