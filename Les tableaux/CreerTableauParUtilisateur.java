import java.util.*;

public class CreerTableauParUtilisateur {

    public static void main(String[] args) {
        int saisie_taille;
        int nombre_saisie = 0;
        int start = 1;
        int tableau[];

        System.out.println("Ecriver la taille du tableau");
        saisie_taille = sc.nextInt();

        System.out.println("Ecriver les valeurs du tableau (INT)");
        nombre_saisie = sc.nextInt();
        tableau = new int[saisie_taille];
        tableau[0] = 1;

        for (int index = 0; index < saisie_taille; index++) {
            System.out.println(index + " " + tableau[index]);
        }
    }
}