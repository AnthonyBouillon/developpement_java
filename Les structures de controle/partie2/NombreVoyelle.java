import java.util.Scanner;

public class NombreVoyelle {
    public static void main(String[] args) {
        // Je récupère la saisie de l'utilisateur
        Scanner sc = new Scanner(System.in);
        System.out.print("Donnez un mot : ");
        String mot = sc.next();
        mot = mot.toLowerCase();
        // Cette variable contiendra le nombre de voyelle dans un mot
        int compteur_de_voyelle = 0;

        for (int i = 0; i < mot.length(); i++) {
            // Je compte caractère par caractère combien de fois les lettres a e i o u y 
            // sont présente
            switch (mot.charAt(i)) {
            case 'a':
                compteur_de_voyelle++;
                break;
            case 'e':
                compteur_de_voyelle++;
                break;
            case 'i':
                compteur_de_voyelle++;
                break;
            case 'o':
                compteur_de_voyelle++;
                break;
            case 'u':
                compteur_de_voyelle++;
                break;
            case 'y':
                compteur_de_voyelle++;
                break;
            }
        }
        System.out.println(comp + " voyelle(s)");

    }

}