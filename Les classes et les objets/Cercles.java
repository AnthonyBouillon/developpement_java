
public class Cercles {
    // Attribut
    public double rayon;

    public double calculSurface(double rayon) {
        double resultat = Math.PI * rayon * rayon;
        return resultat;

    }

    public double calculCirconference(double rayon) {
        double resultat = 2 * Math.PI * rayon;
        return resultat;
    }
}