
public class Cercle {
    final static double PI = 3.1416;

    public static void main(String[] arguments) {
        System.out.println("**** Périmètre et surface du Cercle (V1.0, 24/09/18) ****");

        double rayon;
        double surface;
        double perimetre;
        // Affiche
        System.out.println("Veuillez saisir le rayon du cercle :");
        // Récupère la saisie de l'utilisateur (Console est une classe)
        rayon = Console.lireD();
        // Calcul de la surface du cercle
        surface = PI * rayon * rayon;
        // Calcul du périmètre du cercle
        perimetre = 2 * PI * rayon;
        System.out.println("La surface est : " + surface + " et le perimetre est : " + perimetre);
    }
}
