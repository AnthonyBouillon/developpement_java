
public class Cercles {
    // Attribut
    double rayon;

    public double calculSurface() {
        double resultat = Math.PI * rayon * rayon;
        return resultat;

    }

    public double calculCirconference() {
        double resultat = 2 * Math.PI * rayon;
        return resultat;
    }
}