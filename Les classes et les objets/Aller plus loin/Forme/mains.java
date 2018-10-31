public class mains extends Forme {
    public static void main(String[] args) {
        Forme[] Tableau = { new Carre(2), new Cercle(3), new Triangle(4, 3) };

        float s = 0;

        for (Forme fo : Tableau) {
            s += fo.Aire();
            System.out.println(s);
        }

    }
}