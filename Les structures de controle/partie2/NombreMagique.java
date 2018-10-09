import java.util.*;

public class NombreMagique {
    public static void main(String[] args) {
        // Cette variable contient un chiffre aléatoire de 0 à 10
        int number_random = (int) (Math.random() * 10);
        int number = -1;
        boolean game = true;
        int error = 0;
        int error_restant = 5;

        while (number != number_random && game == true) {
            System.out.println("Essaie de trouver le nombre de l'ordinateur");
            number = Console.lireI();
            if (number < number_random) {
                System.out.println("Plus grand !");
                error++;
                error_restant--;
                if (error_restant == 0) {
                    System.out.println("Perdu");
                } else {
                    System.out.println("Plus que " + error_restant + " essais");
                }

            } else if (number > number_random) {
                System.out.println("Plus petit !");
                error++;
                error_restant--;
                if (error_restant == 0) {
                    System.out.println("Perdu");
                } else {
                    System.out.println("Plus que " + error_restant + " essais");
                }
            } else {
                System.out.println("C'est ça !!!");
                System.out.println("Le chiffre de l'ordinateur est bien : " + number_random);
            }
            if (error == 3) {
                System.out.println("Tu à l'air d'être mauvais, tu veux arrêter ? Ecrit 1");
                int stop = Console.lireI();
                if (stop == 1) {
                    game = false;
                }
            }
            if (error > 4) {
                game = false;
                System.out.println("Le chiffre de l'ordinateur etait : " + number_random);
            }

        }
        if (game == false && error <= 4) {
            System.out.println("Défaitiste !!");
        }

    }
}