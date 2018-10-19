import javafx.css.PseudoClass;

public class exercice_9 {
    public static void main(String[] args) {
        int prix_article;
        int somme = 0;
        int rendu;
        int donne = 0;
        do {
            System.out.println("Lire le/les prix");
            prix_article = Console.lireI();
            somme += prix_article;
        } while (prix_article != 0);

        System.out.println("La somme que vous devez : " + somme + " euros");
        System.out.println("Combien vous donnez ?");
        donne = Console.lireI();
        rendu = donne - somme;
        System.out.println("Votre monnaie : " + rendu + " euros");
        // IL RESTE A FAIRE
        /*
         * Simuler la remise de la monnaie en affichant les textes "10 Euros", "5 Euros"
         * et "1 Euro" autant de fois qu’il y a de coupures de chaque sorte à rendre.
         */
    }
}