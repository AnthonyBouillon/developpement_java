public class exercice_2 {
    public static void main(String[] args) {
        int nombre;
        boolean start = false;
        do {
            System.out.println("Entrer un nombre compris entre 10 et 20");
            nombre = Console.lireI();
            if (nombre > 9 && nombre < 21) {
                System.out.println("Bravo, tu as réussi à écrire un nombre");
                start = true;
            } else if (nombre > 20) {
                System.out.println("Plus petit !");
            } else if (nombre < 10) {
                System.out.println("Plus grand !");
            }
        } while (start == false);

    }
}