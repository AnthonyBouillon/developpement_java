public class exercice_7 {
    public static void main(String[] args) {
        int nombre;
        int nombre_2;
        int compteur = 1;
        int nombre_saisie = 1;
        int position = 0;
        boolean start = false;
        // EXERCICE DEMANDER
        System.out.println("Entrer un nombre");
        nombre = Console.lireI();
        do {
            // EXERCICE DEMANDER
            System.out.println("Entrer un nombre");
            nombre_2 = Console.lireI();
            compteur++;
            if (nombre < nombre_2) {
                nombre = nombre_2;
                position = compteur;
            }
            nombre_saisie++;
            if (nombre_saisie == 5) {
                start = true;
            }
        } while (start == false);
        System.out.println("Nombre maximum : " + nombre + " " + "position : " + position);
    }
}