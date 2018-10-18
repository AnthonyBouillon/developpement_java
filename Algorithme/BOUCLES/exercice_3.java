public class exercice_3 {
    public static void main(String[] args) {
        int nombre;
        boolean start = false;
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre = Console.lireI();
            for (int i = nombre; i <= nombre + 10; i++) {
                System.out.println(i);
            }
            // ----------------------------------------------------
        } while (start == false);

    }
}