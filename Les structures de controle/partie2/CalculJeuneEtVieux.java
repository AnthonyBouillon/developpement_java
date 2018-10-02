public class CalculJeuneEtVieux {
    public static void main(String[] args) {
        System.out.println("Programme qui compte le nombre de personne par age");
        int age;
        int compteurJeune = 0;
        int compteurVieux = 0;
        int compteurEntreDeux = 0;
        int compteurCentenaire = 0;
        int boucle = 1;
        while (boucle == 1) {
            System.out.println("Ecrivez votre âge");
            Scanner sc = new Scanner(System.in);
            String mot = sc.next();
            age = Integer.parseInt(mot);
            if (age < 20) {
                compteurJeune++;
            }
            if (age > 40) {
                compteurVieux++;
            }
            if (age >= 20 && age <= 40) {
                compteurEntreDeux++;
            }
            if (age >= 100) {
                compteurCentenaire++;
                boucle = 0;
            }
        }
        System.out.println("Il y a " + compteurJeune + " personne de moins de 20 ans");
        System.out.println("Il y a " + compteurVieux + " personne de plus de 40 ans");
        System.out.println("Il y a " + compteurEntreDeux + " personne entre 20 et 40 ans");
        System.out.println("Il y a " + compteurCentenaire + " personne de plus de 100 ans");
    }
}