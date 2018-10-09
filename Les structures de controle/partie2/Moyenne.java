public class Moyenne {
    public static void main(String[] args) {
        System.out.println("Programme permettant de calculer une moyenne via plusieurs notes");
        // Déclaration de mes variables
        int note_eleve = 0;
        int note_saisie;
        int somme = 0;
        int moyenne;
        int start = 1;
        int nombre_de_note = 0;
        // Tant que l'utilisateur ne veut pas arrêter, on répète la même procédure
        while (start == 1) {
            // On récupère la note saisie
            System.out.println("Saisissez des entiers");
            note_saisie = Console.lireI();

            // la note saisie est additionné à chaque fois à la note de l'élève
            note_eleve += note_saisie;
            // On récupère le nombre de fois qu'il saisie une note (compteur de note)
            nombre_de_note++;
            // Calcul de la somme
            somme = note_eleve;

            System.out.println("Voulez-vous continuer ? 1 pour oui, 0 pour non");
            start = Console.lireI();
        }
        // Si l'utilisateur arrête de saisir ses notes
        if (start != 1) {
            // On affiche la somme de toutes ses notes
            System.out.println("La somme est de : " + somme);
            // Calcul de la moyenne de toutes ses notes
            moyenne = somme / nombre_de_note;
            // Affiche le résultat
            System.out.println("La moyenne est de : " + moyenne);
        }
    }
}