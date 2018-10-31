import java.util.Scanner;

public class tri_nombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Création de deux objets qui provient de la même classe
        TriNombre Tri_1 = new TriNombre();
        TriNombre Tri_2 = new TriNombre();
        // Tableau 1
        System.out.println("La taille du tableau");
        // Défini une taille
        Tri_1.taille = sc.nextInt();
        Tri_1.tableau = new int[Tri_1.taille];
        // Appelle les méthodes
        Tri_1.saisie();
        Tri_1.tri();
        Tri_1.affiche();
        // -----------------------------------
        System.out.println();
        // -----------------------------------
        // Tableau 2
        System.out.println("La taille du tableau");
        // Définie une taille
        Tri_2.taille = sc.nextInt();
        Tri_2.tableau = new int[Tri_2.taille];
        // Apelle les méthodes
        Tri_2.saisie();
        Tri_2.tri();
        Tri_2.affiche();

        sc.close();
    }
}