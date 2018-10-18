public class exercice_7 {
    public static void main(String[] args) {
        int nombre;
        int nombre_2;
        int compteur = 0;
        int nombre_saisie = 1;
        boolean start = false;
        // EXERCICE DEMANDER
        System.out.println("Entrer un nombre");
        nombre = Console.lireI();
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre_2 = Console.lireI();

            if (nombre < nombre_2) {
                nombre = nombre_2;
                compteur++;
                System.out.println(nombre + " " + nombre_2);
            }
            nombre_saisie++;
            if (nombre_saisie == 20) {
                start = true;
            }
        } while (start == false);
        System.out.println("Nombre maximum : " + nombre);
    }
}