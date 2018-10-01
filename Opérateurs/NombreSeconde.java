
public class NombreSeconde {
    public static void main(String[] arguments) {
        int jour, heure, minute, seconde;
        System.out.println("Ecriver les secondes");
        seconde = Console.lireI();

        jour = seconde / (24 * 60 * 60);
        seconde = seconde % (24 * 60 * 60);
        heure = seconde / (60 * 60);
        seconde = seconde % (60 * 60);
        minute = seconde / 60;
        seconde = seconde % 60;

        System.out.println(jour + "J " + heure + "Hé " + minute + "MIN " + seconde + "S");

    }
}