
public class DesCercles {
    public static void main(String[] args) {
        // J'instancie ma classe Cercles (autre fichier)
        Cercles MaClassCercles = new Cercles();
        // Je récupère la données membre et j'assigne une valeur
        MaClassCercles.rayon = 10;
        // J'apelle la fonction de la classe cercle
        System.out.println(MaClassCercles.calculSurface(MaClassCercles.rayon));

        MaClassCercles.rayon = 45;
        System.out.println(MaClassCercles.calculSurface(MaClassCercles.rayon));

    }

}