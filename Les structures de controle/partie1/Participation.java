public class Participation {
    public static void main(String[] args) {
        char reponse;
        double salaire;
        int Enfant;
        double participation;
        double pourcentage_participation;
        int prix_repas = 10;
        System.out.println("Quel est votre salaire net");
        salaire = Console.lireD();
        System.out.println("Avez vous des enfants ? 0 pour (non)");
        Enfant = Console.lireI();
        System.out.println("Etes vous Célibaire ou Marié.");
        reponse = Console.lireC();
        if (reponse == 'C' || reponse == 'c') {
            if (salaire < 1200) {
                if (Enfant > 0) {
                    pourcentage_participation = 0.3 + (0.1 * Enfant);
                    if (pourcentage_participation >= 0.5) {
                        pourcentage_participation = 0.5;
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    } else {
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    }
                } else {
                    participation = prix_repas * 0.3;
                    System.out.println("La participation est de : " + participation);
                }
            } else {
                if (Enfant > 0) {
                    pourcentage_participation = 0.2 + (0.1 * Enfant);
                    if (pourcentage_participation >= 0.5) {
                        pourcentage_participation = 0.5;
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    } else {
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    }
                } else {
                    participation = prix_repas * 0.2;
                    System.out.println("La participation est de : " + participation);
                }
            }
        } else if (reponse == 'M' || reponse == 'm') {
            if (salaire < 1200) {
                if (Enfant > 0) {
                    pourcentage_participation = 0.35 + (0.1 * Enfant);
                    if (pourcentage_participation >= 0.5) {
                        pourcentage_participation = 0.5;
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    } else {
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    }
                } else {
                    participation = prix_repas * 0.35;
                    System.out.println("La participation est de : " + participation);
                }
            } else {
                if (Enfant > 0) {
                    pourcentage_participation = 0.25 + (0.1 * Enfant);
                    if (pourcentage_participation >= 0.5) {
                        pourcentage_participation = 0.5;
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    } else {
                        participation = prix_repas * pourcentage_participation;
                        System.out.println("La participation est de : " + participation);
                    }
                } else {
                    participation = prix_repas * 0.25;
                    System.out.println("La participation est de : " + participation);
                }
            }

        }
    }
}