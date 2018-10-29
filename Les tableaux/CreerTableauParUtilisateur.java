import java.util.*;

public class CreerTableauParUtilisateur {

    public static void main(String[] args) {
        int saisie_taille;
        int valeur_saisie = 0;
        int start = 1;
        int tableau[];
        int compteur = 0;
        // Récupère la saisie utilisateur pour la taille du tableau
        System.out.println("Ecriver la taille du tableau");
        saisie_taille = Console.lireI();
        // Assigne la taille du tableau
        tableau = new int[saisie_taille];

        while (start == 1) {
            // Récupère les valeurs saisies du tableau
            System.out.println("Ecriver les valeurs du tableau (INT)");
            valeur_saisie = Console.lireI();
            // A chaque saisie du tableau notre compteur incrémente de 1 ce qui correspond
            //
            // l'index du tableau
            tableau[compteur] = valeur_saisie;
            compteur++;
            // On stop la boucle une fois qu'il a rempli entièrement le tableau
            if (compteur == saisie_taille) {
                start = 2;
            }

        }
        // Affiche le tableau
        for (int index = 0; index < saisie_taille; index++) {
            System.out.println(index + " " + tableau[index]);
        }
    }
}