
public class Triangle extends Forme {
    public static void main(String[] args) {
        Triangle Air_triangle = new Triangle();
        System.out.println(Air_triangle.Air());
    }

    double base = 10;
    public double hauteur = 10;
    public double result;

    public double Air() {
        result = (base * hauteur) / 2;
        return result;
    }

}