
public class DesCercles {
    public static void main(String[] args) {
        // J'instancie ma classe Cercles (autre fichier)
        Cercles c1 = new Cercles();
        Cercles c2 = new Cercles();
        // Je récupère la données membre et j'assigne une valeur
        c1.rayon = 10;
        // J'apelle la fonction de la classe cercle
        System.out.println(c1.calculSurface());

        c2.rayon = 45;
        System.out.println(c2.calculSurface());

    }

}