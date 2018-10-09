public class SommeIntervalle {
    public static void main(String[] args) {
        System.out.println("Programme qui permet de d'aditionner jusqu'a que l'utilisateur arrete le programme");
        int number_1;
        int number_2;
        int somme;
        int start = 1;
        // Tant que start est égale à 1, on répète la procédure
        while (start == 1) {
            System.out.println("Saisissez un nombre");
            number_1 = Console.lireI();

            System.out.println("Saisissez un deuxième nombre");
            number_2 = Console.lireI();

            somme = number_1 + number_2;
            System.out.println("Le résultat est : " + somme);
            // On pose la question si l'utilisateur veux arrêter, et on change la valeur de
            // start suivant sa saisie
            System.out.println("Voulez-vous continuer ? 1 pour oui, 0 pour non");
            start = Console.lireI();
        }
    }
}