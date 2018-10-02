
public class SommeEntierInferieur {
    public static void main(String[] args) {
        // A REVOIR
        // Le nombre additionné doit être inférieur à 10;
        System.out.println("Ecriver votre nombre");
        int number_saisie = Console.lireI();

        int number_1 = 10;
        for (int number = 0; number < number_saisie; number++) {
            number_1 = number_1 - 1;
            number_1 = number_1 + number;
            System.out.println(number_1);
        }

    }
}