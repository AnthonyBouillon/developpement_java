public class Moyenne {
    public static void main(String[] args) {
        // A REVOIR
        int number = 0;
        int somme;
        int start = 1;
        while (start == 1) {
            System.out.println("Saisissez des entiers");
            number = Console.lireI();
            System.out.println("Voulez-vous continuer ? 1 pour oui, 0 pour non");
            start = Console.lireI();
        }
        if (start != 1) {
            System.out.println(number);
        }
    }
}