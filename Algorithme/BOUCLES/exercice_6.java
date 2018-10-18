public class exercice_6 {
    public static void main(String[] args) {
        int nombre;
        int somme = 1;
        boolean start = false;
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre = Console.lireI();
            for (int i = 1; i <= nombre; i++) {
                somme = somme * i;

            }
            System.out.println(somme);
            // ----------------------------------------------------
        } while (start == false);

    }
}