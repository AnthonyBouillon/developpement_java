import java.util.*;

public class AfficheNombreCaractere {
    public static void main(String[] args) {
        System.out.println("Programme : compte le nombre de caractère dans une phrase");
        String phrase;
        Scanner lire = new Scanner(System.in);
        System.out.println("Ecriver votre phrase");
        phrase = lire.nextLine();
        System.out.println("La phrase contient : " + phrase.length() + " caractères");
    }
}