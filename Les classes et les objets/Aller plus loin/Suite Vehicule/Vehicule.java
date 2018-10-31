public abstract class Vehicule {
    protected String color, mark;

    public void Marche() {
        System.out.println(this.color + " " + this.mark);
    }
}