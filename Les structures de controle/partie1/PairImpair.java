public class PairImpair {
    public static void main(String[] args) {
        int number;
        System.out.println("Ecriver un nombre");
        number = Console.lireI();
        // Modulo = reste de la division
        if (number % 2 == 0) {
            System.out.println("Le nombre est pair");
        } else {
            System.out.println("Le nombre est impair");
        }

    }
}