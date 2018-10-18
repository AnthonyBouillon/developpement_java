public class exercice_4 {
    public static void main(String[] args) {
        int nombre;
        boolean start = false;
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre = Console.lireI();
            for (int i = 1; i <= 10; i++) {
                System.out.println(nombre + " x " + i + " = " + i * nombre);
            }
            // ----------------------------------------------------
        } while (start == false);

    }
}