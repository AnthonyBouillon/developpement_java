import java.lang.reflect.Array;
import java.util.*;

public class TriNombre {
    public int tableau[];
    public int taille;

    public static void saisie(int tableau[], int taille) {

        boolean answer = true;
        Scanner sc = new Scanner(System.in);
        int index = 0;
        do {
            System.out.println("Remplisser votre tableau");
            int data = sc.nextInt();
            tableau[index] = data;
            index++;
            if (index == taille) {
                answer = false;
            }
            // System.out.println("Continuer ? true");
            // answer = sc.nextBoolean();
        } while (answer == true);
    }

    public static void tri(int tableau[]) {
        int indice = 0;
        do {
            for (int i = 0; i < tableau.length - 1; i++) {
                if (tableau[i] > tableau[i + 1]) {
                    int tableau_ancien = tableau[i];
                    tableau[i] = tableau[i + 1];
                    tableau[i + 1] = tableau_ancien;
                }
            }
            indice++;
            // Tant que le tableau n'as pas été parcouru entièrement
        } while (indice < tableau.length);
    }

    public static void affiche(int tableau[]) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }

}