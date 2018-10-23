import java.util.Scanner;

public class tri_nombre {
    public static void main(String[] args) {
        TriNombre TriNombre = new TriNombre();

        Scanner sc = new Scanner(System.in);
        // TABLEAU 1
        System.out.println("La taille du tableau");
        TriNombre.taille = sc.nextInt();
        TriNombre.tableau = new int[TriNombre.taille];

        TriNombre.saisie(TriNombre.tableau);
        TriNombre.tri(TriNombre.tableau);
        TriNombre.affiche(TriNombre.tableau);

        // TABLEAU 2
        System.out.println("La taille du tableau");
        TriNombre.taille = sc.nextInt();
        TriNombre.tableau = new int[TriNombre.taille];

        TriNombre.saisie(TriNombre.tableau);
        TriNombre.tri(TriNombre.tableau);
        TriNombre.affiche(TriNombre.tableau);
    }
}