public class Participation {
    public static void main(String[] args) {
        int statut;
        int enfant;
        int nombre_enfant;
        int participation;
        double salaire;

        System.out.println("Quel est votre salaire net");
        salaire = Console.lireD();

        System.out.println("Etes vous Célibaire(1) ou Marié(2).");
        statut = Console.lireI();

        System.out.println("Avez vous des enfants ? 1 pour oui");
        enfant = Console.lireI();

        if (salaire >= 1200) {
            if (statut == 1) {
                if (enfant == 1) {
                    System.out.println("Combien d'enfant ?");
                    nombre_enfant = Console.lireI();
                    participation = 20 + (10 * nombre_enfant);
                    if (participation >= 50) {
                        participation = 50;
                    }
                } else {
                    participation = 20;
                }
            } else {
                if (enfant == 1) {
                    System.out.println("Combien d'enfant ?");
                    nombre_enfant = Console.lireI();
                    participation = 25 + (10 * nombre_enfant);
                    if (participation >= 50) {
                        participation = 50;
                    }
                } else {
                    participation = 25;
                }
            }
        } else {
            if (statut == 2) {
                if (enfant == 1) {
                    System.out.println("Combien d'enfant ?");
                    nombre_enfant = Console.lireI();
                    participation = 30 + (10 * nombre_enfant);
                    if (participation >= 50) {
                        participation = 50;
                    }
                } else {
                    participation = 30;
                }
            } else {
                if (enfant == 1) {
                    System.out.println("Combien d'enfant ?");
                    nombre_enfant = Console.lireI();
                    participation = 35 + (10 * nombre_enfant);
                    if (participation >= 50) {
                        participation = 50;
                    }
                } else {
                    participation = 35;
                }
            }
        }
        System.out.println("Votre participation : " + participation);
    }
}