
public class nombre_lettre {
    public static void main(String[] args) {
        int nombre_lettre;
        int compteur = 0;
        System.out.print("Saisissez votre phrase : ");
        String phrase = Console.lireStr();
        nombre_lettre = phrase.length();
        for (int i = 0; i < nombre_lettre; i++) {
            if (phrase.charAt(i) == 'A') {
                compteur++;
            }

        }
        System.out.print(compteur);

    }
}