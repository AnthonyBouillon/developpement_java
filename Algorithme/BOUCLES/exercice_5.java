public class exercice_5 {
    public static void main(String[] args) {
        int nombre;
        int somme = 0;
        boolean start = false;
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre = Console.lireI();
            for (int i = 1; i <= nombre; i++) {
                somme = somme + i;
                System.out.println(somme);
            }
            // ----------------------------------------------------
        } while (start == false);

    }
}