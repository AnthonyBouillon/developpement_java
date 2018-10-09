public class MiniEtMaxi {
    public static void main(String[] args) {
        System.out.println("Programme permettant de calculer une moyenne via plusieurs notes");
        int note_mini;
        int note_max = 0;
        int note_saisie;
        int start = 1;
        // On récupère le premier entier que l'utilisateur saisie
        System.out.println("Saisissez des entiers");
        note_mini = Console.lireI();
        note_max = note_mini;
        while (start == 1) {
            // On récupère ses saisies
            System.out.println("Saisissez des entiers");
            note_saisie = Console.lireI();
            // On vérifie si sa saisie est inférieur à la premiere note, si oui, on
            // enregistre
            if (note_saisie < note_mini) {
                note_mini = note_saisie;
            }
            // Idem mais pour la note la plus haute
            if (note_saisie > note_max) {
                note_max = note_saisie;
            }
            System.out.println("Voulez-vous continuer ? 1 pour oui, 0 pour non");
            start = Console.lireI();
        }
        // Une fois le programme terminé, on affiche
        if (start != 1) {
            System.out.println("La note minimum est de : " + note_mini);
            System.out.println("La note maximum est de : " + note_max);
        }
    }
}