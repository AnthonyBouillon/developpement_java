
public class Triangle extends Forme {
    // Attribut en privé
    private float base;
    private float hauteur;

    // Un constructeur pour définir les attributs en privés
    public Triangle(float base, float hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public float Aire() {
        return (float) (this.base * this.hauteur) / 2;
    }
}