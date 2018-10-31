import java.lang.reflect.Array;
import java.util.*;

public class TriNombre {
    int tableau[];
    int taille;

    public void saisie() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Remplisser votre tableau");
        for (int i = 0; i < tableau.length; i++) {
            int data = sc.nextInt();
            tableau[i] = data;
        }
        sc.close();
    }

    public void tri() {
        Arrays.sort(tableau);
    }

    public void affiche() {
        for (int tab : tableau) {
            System.out.print(tab + ", ");
        }
    }

}