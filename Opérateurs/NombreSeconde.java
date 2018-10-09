
public class NombreSeconde {
    public static void main(String[] arguments) {
        System.out.println("Programme qui convertie les secondes en Jour, heure, minute, seconde");
        int jour, heure, minute, seconde;
        System.out.println("Ecriver les secondes");
        seconde = Console.lireI();
        // Jour = nombre de seconde divisé par 24 heure, 60 minute, 60 seconde
        jour = seconde / (24 * 60 * 60);
        // Seconde = nombre de seconde / le reste des jours, minute et seconde
        seconde = seconde % (24 * 60 * 60);
        heure = seconde / (60 * 60);
        seconde = seconde % (60 * 60);
        // Minute = le nombre de fois qu'il y a de minute dans 60 seconde
        minute = seconde / 60;
        // Seconde = le reste
        seconde = seconde % 60;
        // Affiche
        System.out.println(jour + "J " + heure + "Hé " + minute + "MIN " + seconde + "S");

    }
}