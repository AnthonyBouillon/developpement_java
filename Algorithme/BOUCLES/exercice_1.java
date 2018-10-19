public class exercice_1 {
    public static void main(String[] args) {
        int nombre;
        boolean start = false;

        do {
            System.out.println("Entrer un nombre compris entre 1 et 3");
            nombre = Console.lireI();
            if (nombre > 0 && nombre < 4) {
                System.out.println("Bravo, tu as réussi à écrire un nombre");
                start = true;
            }
        } while (start == false);

    }
}